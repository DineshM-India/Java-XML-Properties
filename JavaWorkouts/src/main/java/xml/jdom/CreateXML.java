package xml.jdom;

import java.io.FileWriter;
import java.io.IOException;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

public class CreateXML {

    public static void main(String[] args) {

        try {
            Document document = new Document();
            document.setRootElement(new Element("developers"));
            document.getRootElement().addContent(createDeveloperXMLElement("1", "Dinesh", "Java"));
            document.getRootElement().addContent(createDeveloperXMLElement("2", "Ravi", "Java"));
            document.getRootElement().addContent(createDeveloperXMLElement("3", "Ganesh", "COBOL"));
            document.getRootElement().addContent(createDeveloperXMLElement("4", "Nirmal", "Devops"));
            XMLOutputter xmlOutput = new XMLOutputter();
            xmlOutput.setFormat(Format.getPrettyFormat());
            xmlOutput.output(document, new FileWriter("sample.xml"));
            System.out.println("File Saved!");
        } catch (IOException io) {
            System.out.println(io.getMessage());
        }
    }

    private static Element createDeveloperXMLElement(String id, String name, String language) {
        Element dev = new Element("developer");
        dev.addContent(new Element("id").setText(id));
        dev.addContent(new Element("name").setText(name));
        dev.addContent(new Element("language").setText(language));
        return dev;
    }
}
