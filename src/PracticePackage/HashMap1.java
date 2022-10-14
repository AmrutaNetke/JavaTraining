package PracticePackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap1 {
	public static void main(String[] args) {
	Map<Integer,String> map= new HashMap();
	map.put(101,"Ram");
	map.put(102,"Sham");
	map.put(103,"Reena");
	map.put(104,"Tina");
	
	for(Map.Entry m :map.entrySet()) {
		System.out.println(m.getKey()+"=> "+m.getValue());
	}
}
}