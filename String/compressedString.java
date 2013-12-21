package String;

public class compressedString {
	
	static String compress(String s){
		int i = 0;
		StringBuilder sb = new StringBuilder();
		
		while(i < s.length()){
			int j = i+1;
			int count = 1;
			
			while(j <s.length()){
				if(s.charAt(i) == s.charAt(j)){
					count ++;
					j++;
					if(j == s.length()-1){
						sb.append(s.charAt(i));
						sb.append(String.valueOf(count));
						return sb.toString();
					}
				}
				else if(s.charAt(i) != s.charAt(j) ){
					sb.append(s.charAt(i));
					sb.append(String.valueOf(count));
					count = 1;
					i = j;
					break;
				}
			}
			if(i == s.length()){
				break;
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(compress("aabbbccccccd"));
	}

}
