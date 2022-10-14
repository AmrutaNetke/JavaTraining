package Task6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//Write a program to traverse (or iterate) HashSet
public class Program2 {public static void main(String[] args)
{
	Set<Integer> set = new HashSet<Integer>();
	set.add(11);
	set.add(50);
	set.add(21);
	set.add(71);
	set.add(50);   
	Iterator<Integer> itr = set.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}	
}
