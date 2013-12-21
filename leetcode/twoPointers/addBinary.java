package leetcode.twoPointers;

public class addBinary {
	
	public static String addBinary(String a, String b) {
        // IMPORTANT: Please reset any member data you declared, as
        // the same Solution instance will be reused for each test case.
        int l1 = a.length();
        int l2 = b.length();
        
        StringBuilder sb = new StringBuilder();
        
        char [] ar = a.toCharArray();
        char [] br = b.toCharArray();
        
        int i=l1-1; int j=l2-1;
        int carry = 0;
        
        while(i >= 0 && j >= 0){
            int val = (toNum(ar[i]) + toNum(br[j])) + carry;
            carry = val / 2;
            sb.append( Integer.toString(val%2));
            i--;
            j--;
            
        }
        
        while (i >=0 ){
        	int val = carry+toNum(ar[i]);
        	carry = val /2 ;
        	sb.append(Integer.toString(val%2));
        	i--;
        }
        
        while (j >=0 ){
        	int val = carry+toNum(br[j]);
        	carry = val /2 ;
        	sb.append(Integer.toString(val%2));
        	j--;
        }
        
        if(carry == 1){
        	sb.append("1");
        }
        
        
        return sb.reverse().toString();
    }
	
	  static int toNum(char c){
	        if(c =='1')
	        return 1;
	        else
	        return 0;
	    }
	

	
	
	public static void main(String[] args) {
		String a = "1111111111";
		String b = "1";
		
		System.out.println(addBinary(a,b));
		
	}

}
