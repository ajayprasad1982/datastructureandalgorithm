/**
 * 
 */
package com.hacker.rank.prog.OOP;

/**
 * @author aprasa03
 *
 */
public class OOPExample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OOPExample1 oo=new OOPExample1();
		doStuff(oo.new Extension());
	}
static void doStuff(Base b)
{
	b.add(8);
	b.print();
	
}
	
	
class Base
{
	int i;
	
	Base()
	{
		add(1);
	}
	void add(int v)
	{
		i=i+v;
	}
	void print()
	{
		System.out.println(i);
	}
}
class Extension extends Base
{
	 Extension() {
		add(2);
	}
	 void add(int v)
	 {
		 i=i+v*2;
	 }
}
}
