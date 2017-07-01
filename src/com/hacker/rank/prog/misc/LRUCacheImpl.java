/**
 * 
 */
package com.hacker.rank.prog.misc;

import java.util.LinkedHashMap;

/**
 * @author aprasa03
 *
 */
public class LRUCacheImpl extends LinkedHashMap<Integer, String> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int MAX_SIZE;

	LRUCacheImpl(int max_size) {
		super(max_size);
		this.MAX_SIZE = max_size;
	}

	@Override
	protected boolean removeEldestEntry(
			java.util.Map.Entry<Integer, String> eldest) {

		return size() > this.MAX_SIZE;
	};

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LRUCacheImpl lruCache = new LRUCacheImpl(4);

		lruCache.put(1, "Object1");
		lruCache.put(2, "Object2");
		lruCache.put(3, "Object3");
		lruCache.get(1);
		lruCache.put(4, "Object4");
		System.out.println(lruCache);
		lruCache.put(5, "Object5");
		lruCache.get(3);
		lruCache.put(6, "Object6");
		System.out.println(lruCache);
		lruCache.get(4);
		lruCache.put(7, "Object7");
		lruCache.put(8, "Object8");
		System.out.println(lruCache);
	}

	public String  get(Integer key) {
		String value=this.remove(key);
		this.put(key, value);
       
        return value;
    }	
	
	
}
