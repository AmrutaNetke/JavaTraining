package Task6;

import java.util.HashMap;
import java.util.Map;
//Write a program to add elements to the HashMap given the key and value data type is String
public class Program4 {

public static void main(String[] args) {
	Map<String,String> map=new HashMap<String,String>();
	map.put("Maharashtra", "Pune");
	map.put("Tamilnadu", "Chennai");
	map.put("Andrapradesh", "Amravati");
	map.put("Madhypradesh", "Indore");
	map.put("Karnatak", "Banglore");
	
	for(Map.Entry m :map.entrySet()) {
		System.out.println(m.getKey()+"=> "+m.getValue());
	}
}
}
