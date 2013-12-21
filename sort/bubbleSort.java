package sort;

public class bubbleSort {
	static void print(int[] a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	
	static void swap(int [] a, int i, int j){
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	
	public static void main(String[] args){
		int [] a = {3,7,1,2,4,6};
		bubbleSort.bbSort1(a);
		bubbleSort.print(a);
	}

	 static void bbSort1(int[] a) {
		 int l = a.length;
		 for(int i=0; i < l; i++){
			 for(int j=l-1;j>0;j--){
				 if(a[j] < a[j-1]){
					 swap(a,j,j-1);
				 }
			 }
		 }
	}
}
