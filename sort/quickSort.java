package sort;

public class quickSort {
	
	static void sort(int [] a){
		qsort(a, 0 ,a.length-1);
	}
	
	// the following is helper
	static void qsort(int[] a, int start, int end){
		if(start >= end){ return;}
		int pivot = partition(a, start, end);
		qsort(a, start, pivot-1);
		qsort(a, pivot+1, end);
	}
	
	static int partition(int[] a, int start, int end){
		int i = start+1;
		int j = end;
		int v = a[start];
		
		while(true){
			while(a[i] < v){
				
				if(i == end) break;
				i++;
			}
			while(a[j] > v){
				
				if(j == start) break;
				j--;
			}
			if(i >= j) break;
			exchange(a, i, j);
			i++; j--;
		}
		exchange(a, j, start);
		return j;
		
//		int i = start;
//		int j = end+1;
//		int v = a[start];
//		while(true){
//			while(a[++i] < v) if(i == end) break;
//			while(a[--j] > v) if(j == start) break;
//			if(i >= j) break;
//			exchange(a, i, j);
//		}
//		exchange(a, start, j);
//		return j;
//		
	}
	
	static  void exchange(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	
	static void printArray(int[] a){
		for(int i=0; i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		int [] a = {5,3,4,0,9,9,9,9,0,0};
		int [] b = {0, 0,0,0,0,0};
		quickSort.printArray(b);
		System.out.println("After sorting the result is: ");
		quickSort.sort(b);
		quickSort.printArray(b);
	}
}
