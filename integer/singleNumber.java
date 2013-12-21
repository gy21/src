package integer;
import java.util.*;
//Given an array of integers, every element appears twice except for one. 
//Find that single one.
//Note:
//Your algorithm  should have a linear runtime complexity. 
//Could you implement it without using extra memory? 


public class singleNumber {
//		HashSet<Integer> h = new HashSet<>();
//		int sum = 0;
//		for(int i=0; i<a.length;i++)
//		{	
//			if(h.add(a[i])){
//				sum += a[i];
//			}
//			else{
//				sum -= a[i];
//			}
//			 
//		}
//		return sum;	
	
	static int single(int[] a){

		int result = 0;
		for(int i=0; i<a.length; i++){
			result = result ^ a[i];
		}
		return result;
	}
	public static void main(String[] args){
		int[] a = {1,1,2,2,4};
		System.out.print(singleNumber.single(a));
	}
}
