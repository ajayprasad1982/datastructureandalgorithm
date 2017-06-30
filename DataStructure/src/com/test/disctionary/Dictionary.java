/**
 * 
 */
package com.test.disctionary;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * @author aprasa03
 *
 *         Sep 5, 2015
 */
public class Dictionary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(getDictionary().contains("help"));

	}

	public static Set<String> getDictionary() {
		BufferedReader in = null;
		Set<String> dictionary = null;
		String word = null;

		try {
			dictionary = new HashSet<String>();
			in = new BufferedReader(new FileReader("D:/Software/dictionary.txt"));
			while ((word = in.readLine()) != null) {
				dictionary.add(word);
			}

		} catch (Exception e) {

		} finally {
			try {
				in.close();
			} catch (IOException e) {
			}
		}
		return dictionary;

	}

}
