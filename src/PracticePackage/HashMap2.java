package PracticePackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMap2 {

	public static void main(String[] args) {
		Map<String, List<String>> map= new HashMap<String, List<String>>();
		
		List<String> li1 = new ArrayList<String>();
		li1.add("No. of Pages=> 500");
		li1.add("Cost of book=> 200/-");
		li1.add("No. of Lessons=> 10");
		li1.add("Edition of book=>2nd");
		
		List<String> li2 = new ArrayList<String>();
		li2.add("No. of Pages=> 1000");
		li2.add("Cost of book=>450/-");
		li2.add("No. of Lessons=> 15");
		li2.add("Edition of book=>5th");
		
		map.put("Mr. Shaha", li1);
		map.put("Mr. Kumar", li2);
		
		for(Map.Entry m :map.entrySet()) {
			System.out.println(m.getKey()+"=> "+m.getValue());
		}
	}

}
