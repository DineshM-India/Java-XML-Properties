package property.file;

import java.io.FileWriter;
import java.util.Properties;

public class PropertyFileGenerate {  
public static void main(String[] args)throws Exception{  
Properties obj=new Properties();  
obj.setProperty("mobile","Redmi");  
obj.setProperty("model","Y2");
obj.setProperty("price","10000");
obj.store(new FileWriter("mobile.properties"),"MobileDetails");
System.out.println("FileCreated!");
}  
} 
