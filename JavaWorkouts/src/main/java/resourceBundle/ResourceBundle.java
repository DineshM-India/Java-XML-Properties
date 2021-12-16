package resourceBundle;

//import java.io.FileReader;
//import java.util.Properties;
import java.util.ResourceBundle;

public class ResourceBundle {  
public static void main(String[] args)throws Exception{  
/* FileReader reader=new FileReader("mobile.properties");  
   Properties obj=new Properties();  
   obj.load(reader);*/
    ResourceBundle rb = ResourceBundle.getBundle("mobile");
    System.out.println(rb.getString("price"));  
    System.out.println(rb.getString("name"));
    System.out.println(rb.getString("model"));
}  
}  
