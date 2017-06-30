package com.collection.test;

public class Compare2StringwWithoutEqualOp {

	public static void main(String[] args) {

			String a="FB";
			String b="Ea";
			//String c="hell";
			String c=new StringBuilder(a).reverse().toString(); 
			String d=new StringBuilder(b).reverse().toString();
			System.out.println(a.hashCode());
			System.out.println(b.hashCode());
			System.out.println();
			
			if(areTheStringsSame(a, b) && areTheStringsSame(c, d))
				System.out.println(true);
			else
			{
				System.out.println(false);
			}
			//System.out.println("a and b are same\t"+areTheStringsSame(a, b));
			//System.out.println("a and c are same\t"+areTheStringsSame(a, c));
			//.out.println("b and c are same\t"+areTheStringsSame(b, c));
			
		
				
		
		
	}

	public static boolean areTheStringsSame(String a,String b){
		switch (getDifferenceInHashCode(a, b)) {
		case 0:
			return true;

		default:
			return false;
		}
	}

	public static int getDifferenceInHashCode(String a,String b){
		return a.hashCode() - b.hashCode();
	}


}
