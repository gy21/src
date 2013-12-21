package Array;

import java.util.HashMap;

//Given an unsorted integer array, find the first missing positive integer.
//
//For example,
//Given [1,2,0] return 3,
//and [3,4,-1,1] return 2.
//
//Your algorithm should run in O(n) time and uses constant space. 


public class firstMissingPositive {

    public static int firstMissingPositive(int[] A) {
    	 if(A.length == 0){
 	    	 return 1; 
 	     }
     	 HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
     	 
     	 int maxNum = Integer.MIN_VALUE;
     	 
     	 for(int i=0; i<A.length; i++){
     		 h.put(A[i],1);
     		 if(A[i] > maxNum){
     			 maxNum = A[i];
     		 }
     	 }
     	 
     	 for(int j=1; j<maxNum; j++){
     		 if(!h.keySet().contains(j)){
     			 return j;
     		 }
     	 }
     	return maxNum+1;
	        
    }
    
    
    
	public static void main(String[] args) {
		
		int [] a = {3,4,1,-1,-1,-1};
		int [] b = {1000, -1};
		int [] c = {1,2,0};
		
		System.out.println(firstMissingPositive(a));
		
		System.out.println(firstMissingPositive(b));
		
		System.out.println(firstMissingPositive(c));

	}

}
