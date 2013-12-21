package DynamicProgramming;
/*
 * A child is running up stairs, he can run 1 2 and 3 steps one time
 * How many ways if he wants run n ? 
 */
public class runStairs {
	
	static int ways(int n){
		if(n == 1)	return 1;
		if(n == 2) return 2;
		if(n == 3) return 3;
		
		return ways(n-1)+ways(n-2)+ways(n-3);
	}
	
	//recursion
	
	static int Fabonacci(int n){
		if(n == 1)	return 1;
		if(n == 2)	return 1;
		
		return Fabonacci(n - 1) + Fabonacci(n-2);
	}
	
 
	
	public static void main(String[] args) {
		System.out.println(runStairs.Fabonacci(34));

	}

}
