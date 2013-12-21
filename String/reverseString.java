package String;

public class reverseString {
	/*
	 * THis is one way reverse
	 */
	static String reverse(String s, int start, int end){
		 
		char[] c = s.substring(start, end).toCharArray();
		
		for(int i=0; i<c.length/2; i++){
			char temp = c[i];
			c[i] = c[c.length-1-i];
			c[c.length-1-i] = temp;
		}
		
		return new String(c);
	}
	
	/*
	 * Here is another way of reverse - reverse word by word!!!
	 */
	
	static String reverseByWord(String s){
		String [] c = s.split(" ");
		//一定记住是除以2咯！！
		for(int i=0; i<c.length/2; i++){
			String temp = c[i];
			c[i] = c[c.length-1-i];
			c[c.length-1-i] = temp;
		}
		String result = "";
		for(String s1:c){
			result += s1 + " ";
		}
		System.out.println(result);
		return result;
	}
	//How about if you are not allowed to use split?
	public static String noSplitReverse(String s){
		if(s == null)	return null;
		char[] c = s.toCharArray();
		
		int i = 0;
		while( i < (c.length-1)/2){
			char m = c[i];
			c[i] = c[c.length-1-i];
			c[c.length-1-i] = m;
			i++;
		}
		
		String newformed = new String(c);
		StringBuilder sb = new StringBuilder();
		int p = 0;
		
		for(int j = 0; j<c.length; j++){
			if(newformed.charAt(j) == ' '){
				sb.append(reverse(newformed,p,j));
				sb.append(" ");
				p = j+1;
			}
			if(j == c.length -1){
				sb.append(reverse(newformed, p, c.length));
				break;
			}
		}
		return sb.toString();
	}
	public static void main(String[] args){
		System.out.println(reverseString.noSplitReverse("abc efg"));
		System.out.println(reverseString.noSplitReverse("I am happy and I am GuoYan!"));
		 reverseString.reverseByWord("I am happy and I am GuoYan!");
		
	}
}
