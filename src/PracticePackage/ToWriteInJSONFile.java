package PracticePackage;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.json.simple.JSONObject;

public class ToWriteInJSONFile {

	public static void main(String[] args) throws FileNotFoundException {
		JSONObject jO= new JSONObject();
		jO.put("first Name","Jerry");
		jO.put("Last Name","Smith");
		jO.put("Age",25);
		jO.put("Salary",50000);
		
		PrintWriter pW= new PrintWriter("JSONFile.json");
		pW.write(jO.toJSONString());
		pW.flush();
		pW.close();
		System.out.println("Success...");
		

	}

}
