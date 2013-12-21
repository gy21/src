package integer;

import java.util.ArrayList;

public class primeNum {
	static ArrayList<Integer> primNum(int k){
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		for(int i=2; i<=k; i++){
			if(isPrime(i)){
				a.add(i);
			}
		}
		return a;
	}

	private static boolean isPrime(int k) {
		for(int j=2; j<=k/2; j++){
			if(k % j == 0){
				return false;
			}
		}
		
		return true;
	}
	
	
	public static void main(String[] args){
		System.out.println(primNum(100));
	}

}
