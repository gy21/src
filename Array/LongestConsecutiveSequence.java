package Array;

import java.util.HashMap;


//Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
//For example,
//Given [100, 4, 200, 1, 3, 2],
//The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.
//Your algorithm should run in O(n) complexity. 


//Since it requires O(n) solution, normal sort won't be work here. Hash probably is the best choice.
//3 Steps:
//1. create the hashmap to hold <num, index>
//2. scan the num vector from left to right, for each num
//               i, check whether num -1 is in the map  (loop)
//              ii, check whether num+1 is in the map  (loop)
//3. track the sequence length during scanning.


public class LongestConsecutiveSequence {
	
	public static int longestConsecutive(int[] num) {
	     if(num.length == 1 || num.length == 0){
	    	 return num.length; 
	     }
    	 HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
    	 
    	 for(int i=0; i<num.length; i++){
    		 h.put(num[i],1);
    	 }
    	 int res = Integer.MIN_VALUE;
    	 
    	 int j = 0;
    	 while( j<num.length ){
    		 int max = 0;
    		 int m = num[j];
    		 int n = num[j]+1;
    		 
    		 while(h.keySet().contains(m)){
    			 h.remove(m);
    		 
    			 m--;
    			 max ++;
    		 }
    		 
    		 while(h.keySet().contains(n)){
    			 h.remove(n);
    	 
    			 n++;
    			 max ++;
    		 }
    		 
    		 if(max > res){
    			 res = max;
    		 }
    		 j++;
    	 }
    	 return res;
	  }
	
	public static void main(String[] args) {
		int [] a = {100,4,200,1,3,2,5,6};
		int [] b = {-4,-4,2,-6,9,6,8,-6,-9,-1,9,5,2,-6,0};
		System.out.println(longestConsecutive(b));
		
	}

}
