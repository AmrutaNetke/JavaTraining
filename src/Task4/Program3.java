package Task4;

import java.util.HashMap;
import java.util.Map;

public class Program3 {
	public static void main(String[] args) {
		String str="I am a Java Program";
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] words = str.split(" ");
		for (String word : words)
		{
			  Integer num = map.get(word);
			    if (num == null) {
			    	map.put(word, 1);
			    }
			    else {
			    	map.put(word, num + 1);
			    }
		}
		System.out.println(map);
	}

}


