/**
 * 
 */
package com.data.structure.stack.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.data.structure.stack.Stack;

/**
 * @author aprasa03
 *
 */
public class PermutationOfNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
       Integer [] input= {1,2,3,4};
       Integer [] input1= {1,2,3};
       int g=0;
       while(g<input.length)
       {
    	  System.out.println(++input[g++]);
       }
       
       Stack stack =new Stack(10);
      perm4(input1);
      // permRecur(input,new ArrayList<Integer>(),0);
		List<Integer> list=new ArrayList <Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		int swap=-1;
		for(int i=0;i<input.length;i++)
		{
			//List result=new ArrayList();
			//result.add(list.get(i));
			for(int j=1;j<input.length-1;)
			{
				 swap=input[j];
				input[j]=input[++j];
				input[j]=swap;
				//result.add(list.get(j));
			//	System.out.println(Arrays.toString(input));
			}
			swap=input[0];
			input[0]=input[input.length-1];
			input[input.length-1]=swap;
			/*if(Arrays.toString(input).equalsIgnoreCase(Arrays.toString(input1)))
			{
				break;
			}
*/			//System.out.println(Arrays.toString(input));
			
		}
		
		
  
  
		
	}

	private static void perm4(Integer[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i == j) {
					continue;
				}
				for (int k = 0; k < array.length; k++) {
					if (i == k || j == k) {
						continue;
					}
					for (int l = 0; l < array.length; l++) {
						if (i == l || j == l || k == l) {
							continue;
						}
						System.out.println(array[i] + ", " + array[j] + ", "
								+ array[k] + ", " + array[l]);

					}

				}

			}

		}

	}
	
private static void permRecur(Integer[] array,List<Integer> index,int j)
{
	if(index.size()==array.length)
	{
		//System.out.println(index);
		System.out.print("[");
		for(int i:index)
		{
			
			System.out.print(array[i]+","); 
		}
		System.out.print("]");
		//System.out.print(array[j]);
		System.out.println();
		//}
		
		
	}else
	{
		for (int i = 0; i < array.length; i++) {
			
			if(!index.contains(i))
			{
				index.add(i);
			
			permRecur(array,index,i);
			
			if(index.contains(i))
			{
				index.remove(index.size()-1);
			}
			
			
			}
		}
		
	}
}


	private static void perm3(Integer[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i == j) {
					continue;
				}
				for (int k = 0; k < array.length; k++) {
					if (i == k || j == k) {
						continue;
					}
					System.out.println(array[i] + ", " + array[j] + ", "
							+ array[k]);

				}

			}

		}

	}
}
