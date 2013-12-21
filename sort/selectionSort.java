package sort;

public class selectionSort {
	public static void main(String[] args){
		int [] a = {3,7,1,2,4,6};
		selectionSort.selectSort(a);
		selectionSort.print(a);
	}
	
	static void print(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	
	static void selectSort(int[] a){
		int l=a.length-1;
		for(int i=0; i<l; i++){
			int index = i+1;
			for(int j=i+1; j<=l; j++){
				 if(a[index] > a[j]) index = j;
			}
			swap(a,i,index);
		}
	}
	 
	static void swap(int [] a, int i, int j){
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

}
