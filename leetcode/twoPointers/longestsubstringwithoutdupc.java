package leetcode.twoPointers;

//Given a string, find the length of the longest substring without repeating characters. 
//For example, the longest substring without repeating letters for "abcabcbb" is "abc",
//which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.
public class longestsubstringwithoutdupc {
	
	
	static int lengthOfLongestSubstring(String s) {
        int res = 0;
        boolean[] a = new boolean[256];
        int j = 0; int i=0;
        for(int k=0; k<a.length;k++){
        	a[k] = false;
        }
        //assume i is the start pointer
        //assume j is the scanner
        while(j < s.length()){
        	if(a[s.charAt(j)] == false){
        		a[s.charAt(j)] = true;
        		j++;
        	}
        	else{
        		res = Math.max(res, (j-i));
        		//ʹ��i�ƶ����ظ�Ԫ�ص��Ǹ�λ��
        		while(s.charAt(i) != s.charAt(j)){
        			//i֮ǰ��Ԫ������Ҫ���±���Ϊfalse ��Ϊ���Ӵ����Ѿ���������Щ�ˡ�����
        			a[s.charAt(i)] = false;
        			i++;
        		}
        		//i���ظ�Ԫ�ص���һλ��ʼ��
        		i ++;
        		j++;
        		}
        	}
        
        
        return res;
        
	}  
	
	
	
	
	public static void main(String[] args){
		System.out.println(longestsubstringwithoutdupc.lengthOfLongestSubstring("abcabcd"));
		System.out.println(longestsubstringwithoutdupc.lengthOfLongestSubstring("aaaaa"));
		System.out.println(longestsubstringwithoutdupc.lengthOfLongestSubstring("wlrbbm"
				+ "qbhcdarzowkkyhiddqscdxrjmowfrxsjybldbefsarcbynecdyggxxpklorellnmpapqfwkhopkmco"));
	}

}
