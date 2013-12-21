package leetcode.twoPointers;

public class trappingRainWater {
	
	public static int trap(int[] A) {
        if(A.length <= 2)   return 0;
        int res = 0;
        
        for(int i=1; i<A.length; i++){
            int k = i-1;
            int j = i+1;
            int rmax = 0;
            int lmax = 0;
//            int leftIndex = 0;
//            int rightIndex = 0;
            
            if(j <= A.length-1){
            	  rmax = A[j];
            	 while(j <= A.length-1){
                     if(A[j] > rmax){
//                         rightIndex = j;
                         rmax = A[j];
                     }
                     j++;
                 }
            }
           
            if(k >=0 ){
                 lmax = A[k];
                while(k >= 0){
                    if(A[k] > lmax){
//                        leftIndex = k;
                        lmax = A[k];
                    }
                    k--;
                }
            }
            
            if(A[i] < Math.min(rmax,lmax)){
                res += Math.min(rmax,lmax)-A[i];
            }
        }
        return res;
    }
	
	
	public static void main(String[] args) {
		int[] a = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(a));
		

	}

}
