package String;

public class atoi {
	//we need consider the following conditions
	//if overflow
	//if negatvie
	//if there is any space
	
//	   public static int romanToInt(String s) {
//	        int result = 0;
//	        for(int i=0; i<s.length();i++){
//	            result = result *10 + s.charAt(i) - '0';
//	        }
//	        
//	        return result;
//	        
//	    }
	
		public static int atoi1(String s){
			char [] a = s.toCharArray();
			int sum = 0;
			for(int i=0; i<a.length; i++){
				sum += (a[i]-'0')*(int)Math.pow(10, a.length-1-i);
			}
			return sum;
		}
	   public static void main(String [] args){
		   System.out.println(atoi.atoi1("12312"));
	   }
	   

}
