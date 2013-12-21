package leetcode.twoPointers;

public class longestCommonPrefix {

	static String longest(String[] strs){
		if(strs.length == 0)	return "";
		if(strs.length == 1)	return strs[0];
		
		String res = strs[0];
		
		//get the shortest length of string in the array
		for(String s:strs){
			if(s.length() < res.length()){
				res = s;
			}
		}
		
		for(int i = 0; i<strs.length; i++){
			String m = strs[i];
			int j = 0;
			
			int k = 0;
			while( k < res.length()){
				if(m.charAt(j) != res.charAt(k)){
					break;
				}
				j++; k++;
			}
			res = res.substring(0,k);
		}
		
		return res;
	}
	public static void main(String[] args) {
		String[] strs = {"abcd", "ab", "abc", "ab"};
		System.out.println(longest(strs));
	}

}
