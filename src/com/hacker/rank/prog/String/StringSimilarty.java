package com.hacker.rank.prog.String;

import java.util.Arrays;

public class StringSimilarty {



static int[] StringSimilarity(String[] inputs) {
	

    int [] counts=new int[inputs.length];
        int k=0;
    for(String s:inputs)
   {
    char[]arr=s.toCharArray();
	int length=arr.length;
	int count=length;
	for(int i=1;i<length;i++){
       int len=length-i;
        int j=0;
	  for(;j<len;j++)
         {
			if(arr[j]!=arr[j+i]){
				break;
			}
      }
		count=count+j;
      
	}
    counts[k++]= count;   
}
	return counts;

}
public static void main(String[] args) {
	String[] inputs={"ababaa"};
	
	System.out.println(Arrays.toString(StringSimilarity(inputs)));
}
}