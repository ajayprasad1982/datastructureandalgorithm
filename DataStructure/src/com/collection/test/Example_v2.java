/**
 * 
 */
package com.collection.test;

/**
 * @author aprasa03
 *
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example_v2 {

     public static void main(String[] args) {
          List<String> list = new ArrayList<String>();

          // Insert some sample values.
          list.add("Value1");
          list.add("Value2");
          list.add("Value3");

          // Get an iterator.
          Iterator<String> ite = list.iterator();

          list.remove(0);

          while(ite.hasNext())
        	  /* Remove the first object of the list. This statement will force the iterator
               * to throw a ConcurrentModificationException. */
             
               System.out.println(ite.next());
     }
}