package leetcode.twoPointers;

public class medianTwoSortedLists {
	
//	There are two sorted arrays A and B of size m and n respectively. 
	//Find the median of the two sorted arrays.
//  The overall run time complexity should be O(log (m+n)).

	public static double findMedianSortedArrays(int A[], int B[]) {
        int a = A.length;
        int b = B.length;
        if(a == 0)   return B[b/2];
        if(b == 0)   return A[a/2];
        
        int i = 0;
        int[] s = new int[a+b];
        int j = 0;
        int k = 0;

        while(i < A.length && j < B.length){
        	if(A[i] < B[j]){
        		s[k++] = A[i++];
        	}
        	else{
        		s[k++] = A[j++];
        	}
        }
        while(i < A.length){
        	s[k++] = A[i++];
        }
        while(j < B.length){
        	s[k++] = A[j++];
        }
//        for(int q=0; q<s.length; q++){
//        	System.out.print(s[q] + " ");
//        }
        return s.length%2 == 0? s[s.length/2]:(s[s.length/2] + s[s.length/2+1])/2;
    }

	 
	public static void main(String[] args) {
		int [] a = {1,2,3};
		int [] b = {1,2};
		
		System.out.println(medianTwoSortedLists.findMedianSortedArrays(a, b));

	}

}
