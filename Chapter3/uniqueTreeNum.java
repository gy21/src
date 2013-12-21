package Chapter3;

public class uniqueTreeNum {
	 public static int numTrees(int n) {
	       if(n <= 1)
	    	   return 1;
	       int sum = 0;
	       
	       for(int root=n; root>=1; root--){
	            int left = numTrees(root-1);
	            int right = numTrees(n-root);
	            sum += left * right;
	       }
	       return sum;
	        
	    }
	 
	 public static void main(String[] args){
		 System.out.println(uniqueTreeNum.numTrees(3));
	 }
}
