package Task6;

import java.util.HashSet;
import java.util.Set;
//Given an element write a program to check if element exists in HashSet
public class Program3 {
public static void main(String[] args) {
	Set<String> set = new HashSet<String>();
	String elementToCheck="Mango";
	set.add("Apple");
	set.add("Mango");
	set.add("Grapes");
	set.add("Banana");
	set.add("Pomogranet");
	System.out.println("Check whether Hashset contains Mango:"+set.contains(elementToCheck));
	
}	
	
}

