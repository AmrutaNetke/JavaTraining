package Task6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Write a program to add elements to ArrayList 
public class Program5 {

	public static void main(String[] args) {
		List<Character> vowels = new ArrayList<Character>();
		vowels.add('A');
		vowels.add('E');
		vowels.add('I');
		vowels.add('O');
		vowels.add('U');
		
		Iterator<Character> itr=vowels.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
