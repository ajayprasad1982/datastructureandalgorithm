/**

 * 
 */
package com.hacker.rank.prog.String;

import java.util.Arrays;

/**
 * @author aprasa03
 *
 */
public class CompressString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str="aaabbcccaaaaba";
		compressWithoutExtraSpace(str);
//compress("abc");
char [] ch=str.toCharArray();

ch[1]='\0';ch[2]='3';ch[4]='\0';ch[5]='3';

//compress(ch,0,0);

	
//System.out.println(Arrays.toString(ch));





	}
	
	
private static void compress(String str)	
{
	StringBuilder sb=new StringBuilder();
	int count=1;
	for(int i=0;i<str.length();i++)
	{
		
		if(i+1<str.length() && str.codePointAt(i)==str.codePointAt(i+1))
		{
			count++;
		}
		else
		{
			if(count!=1)
			{
				sb.append(str.charAt(i)).append(count);
			}
			else
			{
				sb.append(str.charAt(i));
			}
			count=1;
		}
	}
	System.out.println(sb);
}

private static void compressWithoutExtraSpace(String str)	
{
	StringBuilder sb=new StringBuilder(str);
	char ch[]=str.toCharArray();
	int count=1;
	for(int i=0;i<ch.length;i++)
	{
		
		if(i+1<sb.length() && sb.codePointAt(i)==sb.codePointAt(i+1))
		{
			count++;
			ch[i]='\0';
		}
		else
		{
			if(count!=1)
			{
				ch[i-1]=ch[i];ch[i]=(char)(count+'0');
			}
			
			count=1;
		}
	}
	for(char c:ch)
	{ 
		if(c!='\0')
		System.out.print(c);
	}
}


	
//recursive code - prefered
static void compress(char str[],int len, int act) {

if(len<str.length) {
  int k=len;
  int count=0;
  int c, n;
  while(len< str.length && str[k]==str[len]){
      len++; count++;
  }
  n = 0;
  c=count;
  do {
      c /= 10;
      n++;
  } while (c != 0);
  
  compress(str,len,act+n+1);
  
  str[act]=str[k];
  if(k+count==str.length) 
     str[act+n+1]='\0';
  for(c=0;c<n;c++) {
      str[act+n-c]=(char) (48+(count%10));
      count=count/10;
  }
}
return;
}
}
