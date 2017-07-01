/**
 * 
 */
package com.creational;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aprasa03
 *
 */
public class Nton {
	
	private static Integer NUM_OF_INSTANSE=5;
	private static List<Nton> instanse=new ArrayList(NUM_OF_INSTANSE);
	private static Integer requestCount=0;
	private Integer instanceNum;
	
	private Nton()
	{
		
	}
	
	public static Nton getInstance()
	{
		Nton instance=null;
		
		if(instanse.size()==NUM_OF_INSTANSE)
			instance=instanse.get(requestCount%NUM_OF_INSTANSE);
		else
		{
			instance=new Nton();
			instance.instanceNum=instanse.size()+1;
			instanse.add(instance);
			
		}
		requestCount+=1;
		return instance;
	}
	
		@Override
	public String toString() {
		return "Nton instanceNum=" +instanceNum + "";
	}

		public static void main(String[] args) {
			for(int i=0;i<20;i++)
			{
				System.out.println((i+1)+"\t"+Nton.getInstance());
			}

	}

}
