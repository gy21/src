package leetcode.twoPointers;

import java.util.HashMap;
import java.util.Stack;

public class validParentheses {
	
	public static boolean isValid(String s) {
		if(s.isEmpty()) return false;
		
		//��һ��hashmap ���洢���ŵ�ƥ���Ǹ��ܰ���ѡ��
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> h = new HashMap<Character, Character>();
        h.put('{', '}');
        h.put('(', ')');
        h.put('[', ']');
        
        
        for(int i=0; i<s.length(); i++){
        	//���key��������� �����ŵ�left�벿��
        	if(h.keySet().contains(s.charAt(i))){
        		stack.push(s.charAt(i));
        	}
        	//���ֵ��������� �����ŵ��Ұ벿��
        	else if(h.values().contains(s.charAt(i))){
        		if(!stack.isEmpty()){
        			char c = stack.peek();
        			char cmatch = h.get(c);
        			//������ֵ��ջ����hashmapȡ��ֵ��ȵĻ� �ſ��Լ���
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
