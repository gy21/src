 
package sort;

public class mergeSort {
	
	static void sort(int [] a){
		sort(a, 0, a.length-1);
	}
	
	static void sort(int[] a, int start, int end){
		int mid = (start + end)/2;
		if(start >= end) return;
		sort(a, start, mid);
		sort(a, mid+1, end);
		merge(a, start, mid, end);
	}

	static void merge(int[] a, int start, int mid, int end) {
		int[] result = new int[a.length];
		int i = start;
		int j = mid+1;
		int k = start;
		//while the two pointers haven't exhausted
		while(i <= mid && j <= end){
			if(a[i] < a[j]){
				result [k] = a[i];
				i++;k++;
			}
			else{
				result[k] = a[j];
				j++;k++;
			}
			
		}
		//the right half pointer exhausted
		while(i <= mid){
			result[k] = a[i];
			k++; i++;
		}
//		the left half pointer exhausted
		while(j <= end){
			result[k] = a[j];
			k++; j++;
		}
	
		//copy back to the original array
		for(int m=start;m<=end;m++){
			a[m] = result[m];
		}
	}

	static void printArray(int[] a){
		for(int i=0; i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		int [] a = {5,3,4,0,9,9,9,9,0,0};
		int [] b = {18,  6,  9,  1,  4, 15, 12,  5,  6,  7, 11};
		mergeSort.printArray(b);
		System.out.println("After sorting the result is: ");
		mergeSort.sort(b);
		mergeSort.printArray(b);
	}
}
