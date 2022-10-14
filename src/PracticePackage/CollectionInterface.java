package PracticePackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CollectionInterface {
	public static void main(String[] args) {
		List li = new ArrayList();
		li.add("Java");
		li.add(5);
		li.add(7.5);
		li.add(false);
		System.out.println("List Elements: ");
		for(Object obj:li) {
			System.out.println(obj);
		}

		Set set = new LinkedHashSet();
		set.add("Python");
		set.add(5);
		set.add(10.45);
		set.add(5);           
		System.out.println("Set Elements: ");
		for(Object obj:set) {
			System.out.println(obj);
		}

}
}
