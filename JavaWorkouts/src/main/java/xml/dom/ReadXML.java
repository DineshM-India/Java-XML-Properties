package xml.dom;
import java.io.File;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadXML {
	public static void main(String[] args) {
        String filePath = "sample.xml";
        File xmlFile = new File(filePath);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder;
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("developer");
            List < Developer > developerList = new ArrayList < Developer > ();
           for (int i = 0; i < nodeList.getLength(); i++) {
            	developerList.add(getDeveloper(nodeList.item(i)));
            }
            for (Developer emp: developerList) {
                System.out.println(emp.toString());
            }
        } catch (SAXException | ParserConfigurationException | IOException e1) {
            e1.printStackTrace();
        }

    }
    private static Developer getDeveloper(Node node) {
        Developer dev = new Developer();
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) node;
            dev.setId(getTagValue("id", element));
            dev.setName(getTagValue("name", element));
            dev.setLanguage(getTagValue("language", element));
        }
        return dev;
	}
    private static String getTagValue(String tag, Element element) {
        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = (Node) nodeList.item(0);
        return node.getNodeValue();
    }

}
