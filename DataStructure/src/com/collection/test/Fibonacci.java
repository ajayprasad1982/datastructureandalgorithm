package com.collection.test;

import java.util.HashMap;
import java.util.Map;

import sun.reflect.Reflection;

public class Fibonacci implements TestInterface{
	int b=100;
	/**
	 * 
	 */
	public Fibonacci() {
		System.out.println(value);
		
	}
	
	public Fibonacci(int a) {
		System.out.println("a+b\t"+(a+b));
		
	}

	// static int sum=0;
	static public  void       main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		System.out.println(fib(2));
		//map.put(5, fib(5, map));
		System.out.println(fib(2, map));
		//System.out.println(map);
		//System.out.println(fib1(8));
		//System.out.println(fib(500));
		// fibo(3,0,1);
		System.out.println(TestInterface.class.getInterfaces().length);
		System.out.println(Fibonacci.class.getClassLoader());
		System.out.println(int.class.getName());
		}

	private static void fibo(int n, int a, int b) {
		int sum = 0;
		System.out.println(a);
		System.out.println(b);
		for (int i = 1; i <= n; i++) {
			sum = a + b;
			a = b;
			b = sum;
			System.out.println(sum);

		}

	}
	public static int fib1(int n) {
		int fib[]=new int[n];
        fib[0]=0;fib[1]=1;
        for(int i=2;i<n;++i)
        {
        	fib[i]=fib[i-2]+fib[i-1];
        }
		
		return fib[n-1];
	}

	private static int fib(int n) {
		if (n < 2)
			return 1;
		return  fib(n - 1)+fib(n - 2);

	}

	public static int fib(int n, Map<Integer, Integer> map) {
		if (n == 0 || n == 1) {
			return 1;
		}

		if (map.get(n - 2) == null) {
			map.put(n - 2, fib(n - 2, map));
		}

		int fib = map.get(n - 2);

		if (map.get(n - 1) == null) {
			map.put(n - 1, fib(n - 1, map));
		}
		int fib1 = map.get(n - 1);

		return fib + fib1;
	}

}
