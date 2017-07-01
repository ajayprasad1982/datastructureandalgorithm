/**
 * 
 */
package com.hacker.rank.prog.misc;

/**
 * @author aprasa03
 *
 */
public class CheckValidIP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String ipAddress="255.255.255.111";	
System.out.println(isValidIP(ipAddress));
	}
	
	
	private static boolean isValidIP(String ip)
	{
		if(ip==null || ip.length()==0) return false;
		
		String ips[]=ip.split("\\.");
		
		if(ips.length!=4)return false;
		
		for(String str:ips)
		{
			try {
				int ipNum=Integer.parseInt(str);
				if(ipNum<0 || ipNum>255)  return false;
			} catch (NumberFormatException e) {
				return false;
			}
			
		}
		if("255.255.255.255".equalsIgnoreCase(ip)) return false;
		return true;
	}
	

}
