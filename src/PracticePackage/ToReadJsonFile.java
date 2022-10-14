package PracticePackage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.File;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class ToReadJsonFile {
public static void main(String[] args) throws FileNotFoundException {
	File file= new File("FilesForTesting\\JsonFile.json");
	FileReader fReader=new FileReader(file);
	try {
	Object obj=  new JSONParser().parse(fReader);
	JSONObject jObj=(JSONObject)obj;
	
	String id = (String) jObj.get("id");
	System.out.println("id:"+id);
	
	String type = (String) jObj.get("type");
	System.out.println("type:"+type);
	
	String name=(String) jObj.get("name");
	System.out.println("name:"+name);
	
	Double ppu=(Double) jObj.get("ppu");
	System.out.println("ppu:"+ppu);

	
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
