package String;
import java.util.*;
public class romantoInt {
	
	 private static Map<Character, Integer> m = new HashMap<Character, Integer>();
	    static {
	        m.put('M', 1000);
	        m.put('D', 500);
	        m.put('C', 100);
	        m.put('L', 50);
	        m.put('X', 10);
	        m.put('V', 5);
	        m.put('I', 1);
	    };

	 public static int roman(String s){
		 int result = 0;
		 for (int i=0; i<s.length()-1;i++){
			 int cur = m.get(s.charAt(i));
			 int next = m.get(s.charAt(i+1));
			 result += cur*(cur >= next? 1: -1);
		 }
		 return result + m.get(s.charAt(s.length()-1));
	 }
	 
	 public static void main(String [] args){
		 System.out.println(romantoInt.roman("DCXXI"));
	 }
}
