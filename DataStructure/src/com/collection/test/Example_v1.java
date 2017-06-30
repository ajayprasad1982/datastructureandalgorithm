/**
 * 
 */
package com.collection.test;

/**
 * @author aprasa03
 *
 */
import java.util.HashMap;
import java.util.Map;

public class Example_v1 {

     public static void main(String[] args) {
          Map<String, Integer> map = new HashMap<String, Integer>();

          // Insert some sample key-value pairs.
          map.put("Key1", 1);
          map.put("Key2", 2);
          map.put("Key3", 3);
          
          //1<<3=2^3*1
          System.out.println(4<< 3);
          
          //
          System.out.println(3>> 3);
          /* Remove a value of the map, while iterating over it.
           * The following code throws a java.util.ConcurrentModificationException. */
          for(String key: map.keySet()) {
               if(map.get(key) == 1)
                    map.remove(key);
          }
          System.out.println("Successfully removed a pair!");
     }
}