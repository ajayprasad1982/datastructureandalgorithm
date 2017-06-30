package com.collection.test;

public class NumberPlay {
	
	  public static void main(String args[]) {
	        System.out.println(isBleak(4l));
	       /* System.out.println(isBleak(10l));
	        System.out.println(isBleak(11l));
	        System.out.println(isBleak(12l));
	        System.out.println(isBleak(13l));
	        System.out.println(isBleak(14l));
	        System.out.println(isBleak(15l));
	        System.out.println(isBleak(16l));
	        System.out.println(isBleak(17l));*/
	    }


    public static boolean isBleak(Long l) {
        String binary = Long.toBinaryString(l);
        int bitLength = binary.length();
        for (long i = l - bitLength - 1; i <= l; i++) {
            String bin = Long.toBinaryString(i);
            int count = 0;
            for (int j = 0; j < bin.length(); j++) {
                if (bin.charAt(j) == '1') {
                    count++;
                }
            }
            if (count + i == l) {
                //System.out.println("Supported by " + i);
                return true;
            }
        }
        return false;
    }

  }
