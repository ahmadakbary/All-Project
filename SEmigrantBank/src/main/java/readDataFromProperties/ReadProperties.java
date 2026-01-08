package readDataFromProperties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class ReadProperties {

public static void main(String[] args) throws IOException {
	
			
	Properties obj = new Properties();
	FileInputStream obj1 = new FileInputStream ("C:\\\\Users\\\\asbeh\\\\eclipse-workspace\\\\SEmigrantBank\\\\src\\\\main\\\\java\\folder\\Data.properties");
	obj.load(obj1);
			
		System.out.println(obj.getProperty("Name"));
		System.out.println(obj.getProperty("Job"));
		System.out.println(obj.getProperty("City"));
		System.out.println(obj.getProperty("Browser"));
		System.out.println(obj.getProperty("Environment"));
		System.out.println(obj.getProperty("Multiple"));
			
			
	}

}
