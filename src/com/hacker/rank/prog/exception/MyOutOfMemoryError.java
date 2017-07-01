package com.hacker.rank.prog.exception;

import java.util.ArrayList;
import java.util.List;

public class MyOutOfMemoryError {
	static List list =new ArrayList();

	public static void main(String[] args) {
		
		throw new Error();
	//	while(true)
		//{	
			/*try {
			while(true)
			{
				list.add(null);
			}
		} catch (OutOfMemoryError e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
			System.out.println("OOOOOOOOOOOOOOOO");*/

	}
	//}

}
