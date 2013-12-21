package Array;

import java.util.ArrayList;

//Given a number represented as an array of digits, plus one to the number.

public class plusOne {

	
	public static int[]  plusOne(int[] digits) {
		int val = 0;
		int i=0;
		while(i < digits.length){
			val = val*10 + digits[i];
			i++;
		}
		val ++;
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int j = val;
		
		System.out.println(val);
		while(j > 0){
			arr.add( j%10 );
			j = j - j%10;
			j = j/10;
		}
		System.out.println(arr);
		
		int size = arr.size();
		int [] res = new int[size];
		
		for(int m=arr.size()-1; m >= 0; m--){
			res[arr.size()-1-m] = arr.get(m);
		}
		return res;
	
	}

	
	
	static void print(int[]a){
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		int[] a = {1,2};
		int[] b = { 9,8,7,6,5,4,3,2,1,0 };
//		System.out.println(plusOne(a));
		print(plusOne(b));
	}

}
