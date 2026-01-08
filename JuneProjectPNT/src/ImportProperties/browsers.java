package ImportProperties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class browsers {
public static void main(String[] args) throws IOException {

	browsers crt=new browsers();
	crt.Parameters();
}	
public void Parameters() throws IOException {
Properties writing=new Properties();
FileInputStream obj=new FileInputStream("C:\\Users\\asbeh\\eclipse-workspace\\JuneProject\\src\\ImportProperties\\Import.Property");
writing.load(obj);
System.out.println(writing.getProperty("Name"));
System.out.println(writing.getProperty("Job"));
System.out.println(writing.getProperty("City"));
System.out.println(writing.getProperty("Evironment"));
System.out.println(writing.getProperty("Multiple"));

	}
}
