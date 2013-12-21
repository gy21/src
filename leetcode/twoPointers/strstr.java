package leetcode.twoPointers;

public class strstr {
	
	public static String strStr(String haystack, String needle) {
		int l1 = haystack.length();
		int l2 = needle.length();
		
		if(l1==0 || l2==0)
			return "";
		
		int i = 0;
		int j = 0;
		
//		while(i < l1){
//			while(j < l2){ 
//				if(haystack.charAt(i) == needle.charAt(j) && i<l1){
//					if(j == needle.length() -1)
//						return haystack.substring(i);
//						i++; 
//						j++;
//				}
//				else{
//					i++;
//					j=0;
//					break;
//				}
//			}
//		}
		
		while(i + j <= l1+l2-2){
			if(haystack.charAt(i) != needle.charAt(j)){
				if(j == needle.length() -1){
					return haystack.substring(i);
				}
				else{
					i++; 
					j = 0;
				}
			}
			else{
				while( j <needle.length()){
					if(needle.charAt(j) == haystack.charAt(i)){
						if(j == needle.length()-1){
							return needle.substring(i);
						}
						i++; j++;
					}
					else{
						j=0;
						break;
					}
				}
			}
			
			
		}
		return null;
	}
	
	
	public static void main(String[] args){
		String s1 = "mississippi";
		String s2 = "issip";
		
		System.out.println(strStr(s1 , s2));
		
		
	}
	
	
}
