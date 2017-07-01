/**
 * 
 */
package com.hacker.rank.prog.stack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * @author aprasa03
 *
 */
public class CheckValidityOfBracketOfString {
private static List<Character> operators=new ArrayList<Character>(){{add('(');add('{');add('[');}};
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String string="{[(((((((((((((((((((((((((((((())))))))))))))))))))))))))))))]}";
		System.out.println(isValid(string));

	}

	private static boolean isValid(String input)
	{
		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<input.length();i++)
		{
			char ch=input.charAt(i);
			if(operators.contains(ch))
			{
				stack.push(ch);
			}else 
			{
				if(stack.isEmpty()) return false;
				char popped=stack.pop();
				if(!isMatchingParenthensis(popped,ch)) return false;
				
			}
		}
		if(!stack.isEmpty()) return false;
		return true;
	}
	
private static boolean isMatchingParenthensis(char open,char close)
{
	if('('==open && ')'==close)
	{
		return true;
	}
	if('{'==open && '}'==close)
	{
		return true;
	}
	if('['==open && ']'==close)
	{
		return true;
	}
	return false;
}
}
