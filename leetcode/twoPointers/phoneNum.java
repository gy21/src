package leetcode.twoPointers;

import java.util.ArrayList;
import java.util.HashMap;

//Input:Digit string "23"
//Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].

public class phoneNum {
//
//	 public static ArrayList<String> letterCombinations(String digits) {
//	     
//		 
//	 
//	 
//	 
//	 
//	 }
	 
//	ArrayList<String> letterComb(String digits, int index ){
//		 char [] c = digits.toCharArray();
//	      String[] stringmap = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
//	      
//	      
//	      
//	      for(int i=0; i<c.length; i++){
//	    	  if(c[i] != '0' && c[i] != '1'){
//	    		  
//	    		  
//	    	  }
//	      }
//	}
	public static void main(String[] args) {
		int i = 002313;
		int sub = i+1;
		System.out.println(sub);
		
		String regex = "[+-]?\\d+(\\.?\\d+)|\\d*";
		
		String s1 = "123.";
		
		System.out.println(s1.matches(regex));
	}

}
