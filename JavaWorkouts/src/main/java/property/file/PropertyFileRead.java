package property.file;

import java.io.FileReader;
import java.util.Properties;

public class PropertyFileRead {  
public static void main(String[] args)throws Exception{  
    FileReader reader=new FileReader("mobile.properties");  
    Properties obj=new Properties();  
    obj.load(reader);  
    System.out.println(obj.getProperty("mobile"));  
    System.out.println(obj.getProperty("model"));
    System.out.println(obj.getProperty("price"));
}  
}  
