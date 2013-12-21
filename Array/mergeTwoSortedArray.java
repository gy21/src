package Array;

public class mergeTwoSortedArray {

	//Given two sorted integer arrays A and B, merge B into A as one sorted array.
	//You may assume that A has enough space to hold additional elements from B. 
	//The number of elements initialized in A and B are m and n respectively.
	public static void main(String[] args) {
		int m = 1;
		int n = 0;
//		int [] a = {1, 3, 5, 7};
		int [] a = new int[20];
		a[0] = 1;
//		a[1] = 3;
//		a[2] = 5;
//		a[3] = 7;
//		a[4] = 9;
		
		int [] b = {};
		mergeTwoSortedArray.merge(a, b, m, n);
		mergeTwoSortedArray.print(a);
	}
	
	static void print(int [] a){
		for (int i=0; i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	static void merge(int[] a, int[] b, int m, int n){
		 if(n == 0 || m == 0 || b == null) return;
		 
		int length = m+n;
		int i = m-1;
		int j = n-1;
		int k = length-1;
		while(i >= 0 && j >= 0){
			if(a[i] < b[j]){
				a[k] = b[j];
				j--;
			}
			else{
				a[k] = a[i];
				i--;
			}
			k--;
		}
		if(j == -1){
			while(k > 0){
				a[k--] = a[i--];
			}
		}
		/*if(i == -1){
			while(k > 0){
				a[k--] = a[j--];
			}
		}*/
		
	}

}
