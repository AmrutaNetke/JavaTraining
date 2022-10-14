package Assignment7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Program3 {

	public static void main(String[] args) throws FileNotFoundException {
		File file= new File("E:\\ExcelFolder\\JsonFile.json");
		FileReader fir = new FileReader(file);
		try {
			Object obj= new JSONParser().parse(fir);

			JSONObject jo=(JSONObject)obj;
			String id=(String) jo.get("id");
			System.out.println("id : "+id);

			String type=(String) jo.get("type");
			System.out.println("type : "+type);

			String name=(String) jo.get("name");
			System.out.println("name : "+name);

			Double ppu=(Double) jo.get("ppu");
			System.out.println("ppu : "+ppu);

			JSONObject batters = (JSONObject) jo.get("batters");
			System.out.println("batters");
			JSONArray ja=(JSONArray) batters.get("batter");
			for (int i = 0; i < ja.size(); i++) {
				Object object1= ja.get(i);
				JSONObject jObject1 = (JSONObject)object1;
				String id1=(String) jObject1.get("id");
				String type1=(String) jObject1.get("type");
				System.out.println("id : "+id1+ "  type : "+type1);
			}

			JSONArray j2=(JSONArray) jo.get("topping");
			System.out.println("topping");
			for (int i = 0; i < j2.size(); i++) {
				Object object2=j2.get(i);
				JSONObject jObject2=(JSONObject)object2;
				String id2=(String)jObject2.get("id");
				String type2=(String)jObject2.get("type");
				System.out.println("id : "+id2+"  type : "+type2);
			}

		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}

	}

}
