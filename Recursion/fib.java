package Recursion;

public class fib {

	static int f(int x){
		int a = 1;
		int b = 1;
		int c = 2;
		for(int i=3; i<x; i++){
			a = b;
			b = c;
			c = a+b;
		}
		return c;
	}
	
	static int f2(int x){
		if(x == 1||x == 2) return 1;
		return f2(x-1) + f2(x-2);
		
	}
	public static void main(String[] args) {
		System.out.println(fib.f(7));
		System.out.println(fib.f2(7));
	}

}
