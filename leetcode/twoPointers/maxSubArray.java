package leetcode.twoPointers;

public class maxSubArray {

	public static int maxSubArray(int[] A) {
	       if(A.length == 0){
	            return -1;
	        }
	        if(A.length == 1){
	            return A[0];
	        }
	    
	        int max = A[0];
	        int current = 0;
	        
	         
	          for(int i=0; i<A.length; i++){
	                current += A[i];
	                if (current > max){
	                    max = current;
	                }
	                else if(current < 0){
	                    current = 0;
	                }
	               
	            }    
//	        
//	       //if all the numbers in this array are negative
//	       //then we just need to return the largest one.
//	       if(current == 0){
//	    	   current = A[0];
//	           for(int j=1; j<A.length; j++){
//	               if(A[j] > current){
//	                   current = A[j];
//	               }
//	           }
//	       }
	       
	       
	        return current;
	        
	    }
	public static void main(String[] args) {
		int[] a = {-1, -2};
		System.out.println(maxSubArray(a));
	}

}
