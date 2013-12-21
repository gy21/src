package leetcode.twoPointers;

import java.util.HashMap;
import java.util.Stack;

public class validParentheses {
	
	public static boolean isValid(String s) {
		if(s.isEmpty()) return false;
		
		//用一个hashmap 来存储括号的匹配是个很棒的选择！
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> h = new HashMap<Character, Character>();
        h.put('{', '}');
        h.put('(', ')');
        h.put('[', ']');
        
        
        for(int i=0; i<s.length(); i++){
        	//如果key域里面存在 即括号的left半部。
        	if(h.keySet().contains(s.charAt(i))){
        		stack.push(s.charAt(i));
        	}
        	//如果值域里面存在 即括号的右半部。
        	else if(h.values().contains(s.charAt(i))){
        		if(!stack.isEmpty()){
        			char c = stack.peek();
        			char cmatch = h.get(c);
        			//如果这个值和栈顶从hashmap取得值相等的话 才可以继续
        			if(cmatch == s.charAt(i)){
        				stack.pop();
        				continue;
        			}
        			else{
        				return false;
        			}
        			
        		}
        		else{
        			return false;
        		}
        		
        	}
        }
        
        return stack.isEmpty();
    }

	public static void main(String[] args) {
		System.out.println(isValid("{}[]()"));
	}

}
