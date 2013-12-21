package Recursion;
import java.util.*;
public class Parenethesis {
	
	public static ArrayList<String> generateParenthesis(int n){
		ArrayList<String> a = new ArrayList<String>();
		for(String s:get(n)){
			a.add(s);
		}
		return a;
	}
	public static HashSet<String> get(int n) {
        HashSet<String> result = new HashSet<String>();
        if(n == 0){
            result.add("");
            return result;
        }
        for(String sub:generateParenthesis(n-1)){
            for(int j=0; j<sub.length();j++){
            	if(sub.charAt(j) == '('){
            		String newformedString = insert(j, sub, "()");
                    result.add(newformedString);
            	}
            }
            result.add("()" + sub);
        }
        
        
        return result;
        
    }
    
    
    public static String insert(int pos, String s, String pare){
        String s1 = s.substring(0,pos+1);
        String s2 = s.substring(pos+1);
        return s1+pare+s2;
    }
	public static void main(String[] args) {
		System.out.println(Parenethesis.generateParenthesis(6));
	}

}
