package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileRead {

	public static void main(String[] args) throws IOException   {
		File file= new File("FilesForTesting\\file.properties");
		FileInputStream fStream= new FileInputStream(file);
		
		Properties propety= new Properties();
		propety.load(fStream);
		System.out.println(propety.getProperty("firstName"));
		System.out.println(propety.getProperty("lastName"));


	}

}
