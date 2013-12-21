package Array;

public class maxSumArray {
	
	public static int maxSubArray(int[] A) {
	      if(A.length == 0 || A == null){
	          return 0;
	      }
	       
	       if(A.length == 1){
	           return A[0];
	       }
	    
	      int curSum = 0;
	      int maxSum = Integer.MIN_VALUE;
	      for(int i=0 ; i<A.length; i++){
	          curSum += A[i];
	          if(curSum < 0){
	              curSum = 0;
	          }
	          if(curSum > maxSum){
	             maxSum = curSum;
	          }
	      }
	      //if the whole array is negative then return the greatest one
	      if(maxSum == 0){
	          maxSum = A[0];
	          for(int j=0; j<A.length; j++){
	              
	              if(A[j] > maxSum ){
	                maxSum = A[j]  ;
	              }
	          }
	      }
	      return maxSum;
	      
	    }
	public static void main(String[] args){
		int[] a = {2, -1};
		System.out.println(maxSumArray.maxSubArray(a));
	}

}
