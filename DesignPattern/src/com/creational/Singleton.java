/**
 * 
 */
package com.creational;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author aprasa03
 *
 */
public class Singleton {
	private Singleton instance=null;
	
	private Singleton()
	{
		
	}
	
public static Singleton getInstance()
{

	return new Singleton();
}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
       // Runtime.getRuntime().clone();
		String trouble=null;
		if(trouble != null && !trouble.isEmpty()) {
			System.out.println("fine here: " + trouble);
			} else {
			System.out.println("not so fine here:"+ trouble);
			}
		
		List listA = new ArrayList();

		listA.add("3element 1");
		listA.add("1element 2");
		listA.add("2element 3");

		listA.add(0, "4element 0");
		
		System.out.println(listA);
		Collections.sort(listA);
		System.out.println(listA);
		NavigableSet original = new TreeSet();
		original.add("1");
		original.add("2");
		original.add("3");
		
		System.out.println(original);
		System.out.println(original.descendingSet());

		//this headset will contain "1" and "2"
		SortedSet headset = original.headSet("3");
		System.out.println(headset);

		//this headset will contain "1", "2", and "3" because "inclusive"=true
		NavigableSet head = original.headSet("3", true);	
		System.out.println(head);
		
		 original = new TreeSet();
		original.add("1");
		original.add("2");
		original.add("3");
		original.add("4");
		original.add("5");
		
		System.out.println(original.tailSet("4"));

		//this subset will contain "2" and "3"
		SortedSet    subset  = original.subSet("2", "4");

		//this subset will contain "2", "3" and "4" because
//		    fromInclusive=true, and toInclusive=true 
		NavigableSet sub = original.subSet("2", true, "4", true);
		
		//ceiling will be "2".
		System.out.println(original.ceiling("3"));

		//floor will be "2".
		System.out.println(original.floor("2"));
		System.out.println(original.pollFirst());
		System.out.println(original);
		
		
		
		
		
		
	}

}
