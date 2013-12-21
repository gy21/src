package integer;

public class squareRoot {
	
	public static int sqrt(int x) {
        if(x ==0 || x== 1) return x;
        if(x < 0) return -1;
        
        int start = 0;
        int end = x;
     
        while(end-start >= 0){
            int mid = (start + end)/2;
            double midsqr = mid * mid;
            
            if(midsqr == x)
                return (int)mid;
            else if(midsqr < x){
                start = mid+1;
            }
            else if(midsqr > x){
                end = mid - 1;
            }
        }
        return (int) end;
        
    }
	 public static int sqrtFromGit(int x) {
	        // Start typing your Java solution below
	        // DO NOT write main() function
	        long low = 0;
	        long high = x;
	        while(low <= high){
	            long mid = low + (high - low) / 2;
	            long result = mid * mid;
	            if(result == x){
	                return (int)mid;
	            } else if(result > x){
	                high = mid - 1;
	            } else{
	                
	                low = mid + 1;
	            }
	        }
	        return (int)high;
	    }
	public static void main(String[] args){
		System.out.println(squareRoot.sqrt(10));
	}

}
