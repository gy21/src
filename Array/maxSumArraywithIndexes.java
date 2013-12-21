package Array;

public class maxSumArraywithIndexes {

	static void maxSumWithIndexes(int[] a){
		int maxSum = Integer.MIN_VALUE;
		int curSum = 0;
		int start = 0;
		int end = 0;
		
		for(int i=0; i<a.length; i++){
			curSum += a[i];
			
			if(curSum < 0){
				curSum = 0;
				start = i+1;
				end = i+1;
			}
			else{
				if(curSum > maxSum){
					maxSum = curSum;
					end = i;
				}
			}
		}
		System.out.println(start);
		System.out.println(end);
		System.out.println(maxSum);
	}
	public static void main(String[] args) {
		int[] a = {-2,-3,4,-1,-2,1,5,-3};
		int[] b = {-1,3,-5,4,6,-1,2,-7,13,-3};
		maxSumArraywithIndexes.maxSumWithIndexes(a);
	}

}
