package leetcode.twoPointers;

public class RemoveDuplicatesSortedArray2 {
	
	static int removeDup(int[] A){
		if(A.length <= 1){
			return A.length;
		}
//		int i = 1;
		int j = 1;
		int val = A[0];
		int count = 1;
		for(int i=1; i<A.length; i++){
			if(A[i] == val){
				count++;
			}
			else{
				val = A[i];
				count = 1;
			}
			if(count <= 2){
				A[j] = A[i];
				j++;
			}
		}
		return j ;
	}
	
	public static void main(String[] args){
		int[] a = {1,1,1,1,1,2,2,2,3};
		int[] b = {1,1,1,2,2,2,3,5,5,6,6,6,6,6};
		System.out.println(removeDup(b));
	}
}
