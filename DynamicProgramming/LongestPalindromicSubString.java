package DynamicProgramming;

public class LongestPalindromicSubString {

	public static void main(String[] args) {
		String s = "ababa";
		System.out.println(LongestPalindromicSubString.lss(s));
	}
	
	private static String lss(String s){
		if(s.isEmpty()){
			return s;
		}
		else{
			return lss(0, s.length()-1, s);
		}
	}
	
	private static String lss(int l, int h, String s){
		if( l== h){
			return String.valueOf(s.charAt(l));
		}
		if(s.charAt(l) == s.charAt(h)){
			StringBuilder sb = new StringBuilder();
			sb.append(s.charAt(l));
			sb.append(lss(l+1, h-1, s));
			sb.append(s.charAt(h));
			return sb.toString(); 
		}
		else if(s.charAt(l) != s.charAt(h)){
			return lss(l+1, h-1, s);
		}
		
		return "";
	}

}
