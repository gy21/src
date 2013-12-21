package Recursion;

public class climbStairs {
	//recursion
	public static int climbStairs(int n) {
        if( n== 1)
            return 1;
        if(n == 2)
        return 2;
        
        return climbStairs(n-1)+climbStairs(n-2);
	}
	
	//without recursion
	public static int climstairs1(int n){
		int a = 1;
		int b = 2;
		int c = 0;
		if(n == 1)
			return a;
		if(n == 2)
			return b;
		
		for (int i = 2; i < n; ++i){
	        c = a + b;
	        a = b;
	        b = c;
		}
		
		return c;
	}
	public static void main(String[] args){
		System.out.println(climbStairs(38));
		System.out.println(climstairs1(5));
		String s = "aa";
		
	}
}
