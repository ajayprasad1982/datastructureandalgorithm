/**
 * 
 */
package com.collection.test;

import java.util.Arrays;

/**
 * @author aprasa03
 *
 */
public class LevenshteinDistance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(minDistance("abc","abc"));

	}
	
	public static int getLevenshteinDistance(String s, String t) {
	      if (s == null || t == null) {
	          throw new IllegalArgumentException("Strings must not be null");
	      }

	      /*
	         The difference between this impl. and the previous is that, rather 
	         than creating and retaining a matrix of size s.length()+1 by t.length()+1, 
	         we maintain two single-dimensional arrays of length s.length()+1.  The first, d,
	         is the 'current working' distance array that maintains the newest distance cost
	         counts as we iterate through the characters of String s.  Each time we increment
	         the index of String t we are comparing, d is copied to p, the second int[].  Doing so
	         allows us to retain the previous cost counts as required by the algorithm (taking 
	         the minimum of the cost count to the left, up one, and diagonally up and to the left
	         of the current cost count being calculated).  (Note that the arrays aren't really 
	         copied anymore, just switched...this is clearly much better than cloning an array 
	         or doing a System.arraycopy() each time  through the outer loop.)

	         Effectively, the difference between the two implementations is this one does not 
	         cause an out of memory condition when calculating the LD over two very large strings.
	       */

	      int n = s.length(); // length of s
	      int m = t.length(); // length of t

	      if (n == 0) {
	          return m;
	      } else if (m == 0) {
	          return n;
	      }

	      if (n > m) {
	          // swap the input strings to consume less memory
	          String tmp = s;
	          s = t;
	          t = tmp;
	          n = m;
	          m = t.length();
	      }

	      int p[] = new int[n+1]; //'previous' cost array, horizontally
	      int d[] = new int[n+1]; // cost array, horizontally
	      int _d[]; //placeholder to assist in swapping p and d

	      // indexes into strings s and t
	      int i; // iterates through s
	      int j; // iterates through t

	      char t_j; // jth character of t

	      int cost; // cost

	      for (i = 0; i<=n; i++) {
	          p[i] = i;
	      }

	      for (j = 1; j<=m; j++) {
	          t_j = t.charAt(j-1);
	          d[0] = j;

	          for (i=1; i<=n; i++) {
	              cost = s.charAt(i-1)==t_j ? 0 : 1;
	              // minimum of cell to the left+1, to the top+1, diagonally left and up +cost
	              d[i] = Math.min(Math.min(d[i-1]+1, p[i]+1),  p[i-1]+cost);
	          }

	          // copy current distance counts to 'previous row' distance counts
	          _d = p;
	          p = d;
	          d = _d;
	      }

	      // our last action in the above loop was to switch d and p, so p now 
	      // actually has the most recent cost counts
	      return p[n];
	  }
	public static int minDistance(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
 
        // len1+1, len2+1, because finally return dp[len1][len2]
        int[][] dp = new int[len1 + 1][len2 + 1];
 
        for (int i = 0; i <= len1; i++) {
               dp[i][0] = i;
             //  System.out.println("dp[i][0]\t"+Arrays.toString(dp[i]));
        }
        
        
        for (int j = 0; j <= len2; j++) {
               dp[0][j] = j;
               //System.out.println("dp[0][j]\t"+Arrays.toString(dp[j]));
        }
        
        //iterate though, and check last char
        for (int i = 0; i < len1; i++) {
               char c1 = word1.charAt(i);
               System.out.println("c1\t"+c1);
               for (int j = 0; j < len2; j++) {
                       char c2 = word2.charAt(j);
                       System.out.println("c2\t"+c2);
 
                       //if last two chars equal
                       if (c1 == c2) {
                               //update dp value for +1 length
                               dp[i + 1][j + 1] = dp[i][j];
                               System.out.println("dp[i][j]\t"+dp[i][j]);
                               System.out.println("dp[i + 1][j + 1]\t"+dp[i + 1][j + 1]);
                       } else {
                               int replace = dp[i][j] + 1;
                               System.out.println("dp[i][j] + 1\t"+replace);
                               int insert = dp[i][j + 1] + 1;
                               System.out.println("dp[i][j + 1] + 1\t"+insert);
                               int delete = dp[i + 1][j] + 1;
                               System.out.println("dp[i + 1][j] + 1\t"+delete);
 
                               int min = replace > insert ? insert : replace;
                               System.out.println("replace > insert ? insert : replace;\t"+min);
                               min = delete > min ? min : delete;
                               System.out.println("delete > min ? min : delete\t"+min);
                               dp[i + 1][j + 1] = min;
                               System.out.println("dp[i + 1][j + 1]\t"+min); 
                       }
               }
        }
 
        return dp[len1][len2];
}

	      
}
