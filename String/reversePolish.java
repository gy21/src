package String;

import java.util.HashSet;
import java.util.Stack;


public class reversePolish {
	/** Compute the value of an expression in Reverse Polish order. Supported 
	operators are "+", "-", "*" and "/".
	* Reverse Polish is a postfix mathematical notation in which each operator 
	immediately follows its operands.
	* Each operand may be a number or another expression.
	* For example, 3 + 4 in Reverse Polish is 3 4 + and 2 * (4 + 1) would be 
	written as 4 1 + 2 * or 2 4 1 + *
	*
	* @param ops a sequence of numbers and operators, in Reverse Polish order
	* @return the result of the computation
	* @throws IllegalArgumentException ops don't represent a well-formed RPN 
	expression
	* @throws ArithmeticException the computation generates an arithmetic error
	, such as dividing by zero
	*
	* Some sample ops and their results:
	* ["4", "1", "+", "2.5", "*"] -> ((4 + 1) * 2.5) -> 12.5
	* ["5", "80", "40", "/", "+"] -> (5 + (80 / 40)) ->  7
	**/

		static double resultRPN(String[] s){
			if(s.length == 0)	return -1;
			Stack<Double> stack = new Stack<Double>();

			double res = 0;
			
			for(int i=0; i<s.length; i++){
				if(!isSign(s[i])){
					stack.push(Double.parseDouble(s[i]));
				}
				else{
					double val1 = stack.pop();
					double val2 = stack.pop();
					
					
					if(s[i] == "*"){
						res = val2*val1;
					}
					if(s[i] == "+"){
						res = val2+val1;
					}
					if(s[i] == "-"){
						res = val2-val1;
					}
					else if(s[i] == "/"){
						if(val1 == 0){
							throw new ArithmeticException();
						}
						res = val2/val1;
					}
				
					stack.push(res);
				}
			}
			
			res = stack.pop();
			
			if(!stack.isEmpty()){
				throw new IllegalArgumentException();
			}
			
			return res;

		}

		
		static boolean isSign(String s){
			if(s == "*" || s =="-" || s == "+" || s =="/"){
				return true;
			}		
			return false;
		}

		
		//Reverse Polish to infix expression
		static String resultRPNtoInfix(String[] s){

			StringBuilder sb = new StringBuilder();
			Stack<String> st = new Stack<String>();
			
			for(int i=0; i<s.length; i++){
				if(!isSign(s[i])){
					st.add(s[i]);
				}
				//if it's a sign then we need to pop from the stack
				else{
					String s1 = st.pop();
					String s2 = st.pop();
					
					if(s[i] == "*"){
						sb.append(s1);
						sb.append("*");
						sb.append(s2);
					}
					
					if(s[i] == "+"){
						sb.append("(");
						sb.append(s1);
						sb.append("+");
						sb.append(s2);
						sb.append(")");
					}
					if(s[i] == "-"){
						sb.append("(");
						sb.append(s2);
						sb.append("-");
						sb.append(s1);
						sb.append(")");
					}
					else if(s[i] == "/"){
						sb.append(s2);
						sb.append("/");
						sb.append(s1);
					}
					
					st.add(sb.toString());
					sb = new StringBuilder();
				}
			}
			
			return st.pop();
		}
		
		
		
		//Infix expression to Reverse Polish expression
		
		static String infixToRP(String[] str){
			StringBuilder sb = new StringBuilder();
			Stack<String> s = new Stack<String>();
			
			for(int i=0; i<str.length ; i++){
				if(str[i] == "("){
					s.push("(");
				}
				else if(str[i] == ")"){
					while(!s.isEmpty()){
						String temp = s.pop();
						if(temp == "("){
							s.push("(");
							break;
						}
						sb.append(temp);
					}
				}
				else if(str[i] == "+" || str[i] == "-"){
					String top = s.peek();
					if(top == "/" || top == "*"||top == "("){
						sb.append(str[i]);
					}
					else{
						s.push(str[i]);
					}
				}
				else{
					String top = s.peek();
					if(top == "+" || top == "-"){
						s.push(str[i]);
					}
					else{
						sb.append(str[i]);
					}
				}
			}
			return sb.toString();
		}
		
		public static void main(String[] args){
			String[] s = {"4", "1", "+", "2.5", "*"};
			String[] s1 = {"5", "80", "40", "/", "+"};
			String[] s2 = {"5", "4", "+", "6","-", "*","2", "+"};
//			System.out.println(resultRPN(s));
//			System.out.println(resultRPN(s2));
//			System.out.println(resultRPN(s1));
			HashSet<Integer> hs = new HashSet<Integer>();
			
			
			String reg = "[+-]?\\d+(\\.?\\d+)|(\\d*)";
			System.out.println("-1234.1".matches(reg));
		}
}
