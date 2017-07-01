package com.hacker.rank.prog.exception;

import javax.management.RuntimeErrorException;

public class Example1 {

	public static void main(String[] args) {

		try{
			bar();
			
		}finally{
			try{foo();
			}
			catch(Exception e)
			{
				
			}
		}
	}

static void foo() throws Exception
{
	throw new MyException();
}
static void bar()
{
	throw new RuntimeException();
}
	
}
class MyException extends Exception
{
	
}
