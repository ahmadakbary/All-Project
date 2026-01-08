package sept_01_2021ExceptionHandling;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileReadingExampleCheckedExceptions {
public static void main(String[] args) throws FileNotFoundException {
		
	File f = new File ("path");
	
	FileInputStream fs = new FileInputStream (f);
//throws is checked exception.
// checked will force you to handle the exception before running the code
	}

}
