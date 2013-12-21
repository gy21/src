package leetcode.twoPointers;

public class atoi {
	public static int atoii(String str) {
		char[] c  = str.toCharArray();
        int res = 0;
        
        boolean flag = false;
        
        int j = 0;
        while(j <c.length){
        	if(c[j] == ' ' || c[j] =='0'){
        		j++;
        	}
        	if(c[j] == '+'){
        		flag = false;
        		j++;
        		break;
        	}
        	if(c[j] == '-'){
        		flag = true;
        		j++;
        		break;
        	}
        	if(c[j] > (int)'9' || c[j] < (int)'0'){
        		j++;
    		 if(j == c.length-1){
    	        	return 0;
    	     }
        	}
        	if (c[j] <= (int)'9' && c[j] >= (int)'0'){
        		break;
        	}
        }
        for(int i=j; i<c.length; i++){
            if(c[i]==' '){
                return res;
            }
            else{
            	if((res > Integer.MAX_VALUE/10 && (c[i+1] <= (int)'9' || c[i+1] >=(int)'0')) 
                		|| (res < Integer.MIN_VALUE/10 && (c[i+1] <= (int)'9' || c[i+1] >=(int)'0')) 
                		|| (res == Integer.MAX_VALUE/10 && c[i+1]-'0' > 7 && c[i+1]-'0' <= 9) 
                		|| (res == Integer.MIN_VALUE/10 && c[i+1 ]-'0'>8 && c[i]-'0' <= 9))
                {
                	return flag==true?Integer.MIN_VALUE:Integer.MAX_VALUE;
                }
            	 if(flag && c[i] <= (int)'9' && c[i] >= (int)'0'){
                 	res = res*10 - (c[i] - '0');
                 }
                 if(!flag && c[i] <= (int)'9' && c[i] >= (int)'0'){
                     res = res * 10 + c[i]-'0';
                 }
                 else if(c[i] > (int)'9' || c[i] < (int)'0'){
                	 return res;
                 }
            }
        }
        
        return res;
    }
	
	
	 
	public static void main(String[] args){
		//System.out.println(atoi.atoii("     124532234$#%#$^"));
//		System.out.println(atoi.atoii("123 456"));
		System.out.println(atoi.atoii("-1010023630o4"));
//		System.out.println(atoi.atoii("+1"));
	}
}
