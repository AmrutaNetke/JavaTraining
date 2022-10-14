package Task6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//Write a program to traverse (or iterate) ArrayList
public class Program1 {

	public static void main(String[] args) {
		 List<String> city = new ArrayList<>();
		 city.add("Pune");
		 city.add("Chennai");
		 city.add("Banglore");
		 city.add("Mumbai");

/*		  Using for loop
	    for(int i = 0; i < city.size(); i++) 
	    {
	    	System.out.print(city.get(i));
		    System.out.print(", ");
	    }*/

/*	Using Advance for loop    
 		for(String al:city)
	    {
	    	System.out.println(al);
	    }*/

//	    Using Iterator
	    Iterator<String> itr= city.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
	}

}
