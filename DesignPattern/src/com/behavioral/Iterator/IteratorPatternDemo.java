/**
 * 
 */
package com.behavioral.Iterator;

/**
 * @author aprasa03
 *
 */
public class IteratorPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
NameRepository<String> name= new NameRepository<String>();
		for(Iterator<String> itr=name.getIterator(); itr.hasNext();)
		{
			String str=itr.next();
			System.out.println(str);
		}
		System.out.println("----------------------------------");
		name= new NameRepository<String>();
		for(Iterator<String> itr=name.getIterator(); itr.hasNext();)
		{
			String str=itr.next();
			System.out.println(str);
		}
	}

}
