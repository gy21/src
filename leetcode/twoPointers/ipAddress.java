package leetcode.twoPointers;

import java.util.ArrayList;
//Given a string containing only digits, restore it by returning all possible valid IP
//address combinations.
//
// IP addresses are in range of 0 to 255;
// 
//For example:
//Given "25525511135",
//
//return ["255.255.11.135", "255.255.111.35"]. (Order does not matter) 
//我们需要插入三个小数点。


public class ipAddress {
	
	public static ArrayList<String> restoreIpAddresses(String s) {
		
		ArrayList<String> res = new ArrayList<String>();
		
		if(s.length() < 4 || s.length() > 12){
		
		}
		
		return res;
    }
	
	static boolean validIP(String s){
		int i = Integer.parseInt(s);

		if(i <= 255 && s.charAt(0) != '0' && i >= 0){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		String s = "25525511135";
		System.out.println(restoreIpAddresses(s));
	}
}
