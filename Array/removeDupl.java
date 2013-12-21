package Array;

//Given a sorted array, remove the duplicates 
//in place such that each element appear only once and return the new length.
//
//Do not allocate extra space for another array
//you must do this in place with constant memory.
//
//For example,
//Given input array A = [1,1,2],
//
//Your function should return length = 2, and A is now [1,2]. 

public class removeDupl {
//	int i = 0;
//	int j = i+1;
//	while(i < A.length && j<A.length){
//		while(A[i] == A[j]){
//			j++;
//			if(j == A.length -1 ){
//				j--;
//				break;
//			}	
//		}
//		A[i+1] = A[j];
//		i++;
//	}
//	return i;
	static int removeDup(int [] A){
		if(A.length == 1 || A.length == 0) return A.length;

		int start = 0;
		for(int j=1; j<A.length; j++){
			if(A[start] != A[j]){
				A[start+1] = A[j];
				start++;
			}
			 
		}
		return start+1;
	}
	
	public static void main(String[] args){
		int[] a = {1,1,2,2,2,3,4,4,4};
		System.out.println(removeDupl.removeDup(a));
		
	}
}
