/**
 * 
 */
package com.hacker.rank.prog.misc;

/**
 * @author aprasa03
 *
 */
public class GenerateRandomNumWithoutMathRandom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MyRandom ran=new MyRandom(10);
		for(int i=1;i<=20;i++)
		{
			System.out.println(ran.nextInt());
		}
	}
}
class MyRandom
{
	private int max;
	private int last;
	
	public MyRandom(int max)
	{
		this.max=max;
		last=(int)(System.currentTimeMillis()%max);
	}
	public int nextInt()
	{
		last=((last*32719)-3)%32719;
		return last=(int)(System.currentTimeMillis()%max);
	}
}