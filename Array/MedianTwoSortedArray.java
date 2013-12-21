package Array;

public class MedianTwoSortedArray {

	//The time complexity is O(m+n)
	static double Median(int[] A, int [] B){
		int l = A.length + B.length;
		int[] AB = new int[l];
		int i = 0; int j = 0; int k=0;
		while( i<A.length && j<B.length){
			if(A[i] <= B[j]){
				AB[k++] = A[i++];
			}
			else{
				AB[k++] = B[j++];
			}
		}
		if(i == A.length){
			while(j < B.length){
				AB[k++] = B[j++];
			}
		}
		
		if(j == B.length){
			while(i < A.length){
				AB[k++] = B[i++];
			}
		}
		
		return AB[l/2];
		  
	}
	
	
	//WE need a more efficient way computing this
	//divide and conqure
	
	
	
	public static void main(String[] args) {
		int [] A = {0,4,5,6,7};
		int [] B = {4,9,10,12};
		
		System.out.println(MedianTwoSortedArray.Median(A, B));
	}

}
