package LibraryFunctions;

public class sqrRoot {
 
	static double sqroot (double i)
	{
		if( i == 0 || i == 1) return i;
		if(i < 0 ) return -1;
		

			double start = 0;
			double end = i;
			double pre = 0.00001;
			while(start < end - pre)
			{
			
				double mid = (start + end)/2 ;
				double midSqr = mid * mid;
				//we need to consider this situation as well
//				if(i < 1) end = 1;
				
				if(midSqr == i)	return mid;
				//this means mid < real sqr root
				//put the start from mid
				else if(midSqr < i){
					start = mid;
				}
				else{
					end = mid;
				}
			}
		 
		
		return (start+end)/2;
	}
	
	 public static int sqrt(int x) {
	        if(x ==0 || x== 1) return x;
	        if(x < 0) return -1;
	        int start = 0;
	        int end = x;
	        while(start <= end){
	            int mid = (start + end)/2;
	            int midsqr = mid * mid;
	            if(midsqr == x)
	                return mid;
	            else if(midsqr < x){
	                start = mid;
	            }
	            else{
	                end = mid;
	            }
	        }
	        
	         
	        return (start + end)/2;
	        
	    }
	
	
	
	
	public static void main(String[] args){
		System.out.println(sqrRoot.sqroot(17));
		System.out.println(sqrRoot.sqrt(17));
	}
}
