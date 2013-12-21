package leetcode.twoPointers;

import java.util.ArrayList;
import java.util.Arrays;

public class threeSumClosest {

	public static void main(String[] args) {
		int[] num = {-1, 2, 1, -4};
		int[] a = {0,0,0};
		int[] c = {1,1,1,0};
		int [] d = {-3,0,1,2};
		System.out.println(threeSumClosest.threeSumClosest(d, 1));

	}

	public static int threeSumClosest(int[] num, int target) {
		
		int diff = Integer.MAX_VALUE;
		
		 if(num.length < 3){
	    		return 0;
	     }
		
		 Arrays.sort(num);
		 int res = 0;
		 for(int i=0; i <= num.length-3; i++){
				
			 int start = i+1;
			 int end = num.length-1;

			 while(start < end){
				 //���һ��Ҫ����ѭ�������棻�տ�ʼ����ˡ�
				 //���⣬��һ������������ֵ�ĺͱȽϷ��� 
				 int sum = num[start] + num[end]+ num[i];
				 
				 if( sum < target){
					 //�þ���ֵ�ȽϺ� ʡ�ſ���˭�����ˡ�
					 if(Math.abs(target - sum) < Math.abs(diff)){
						 diff = sum - target;
						 res = sum;
					 }
					 start ++;
					 
					 
				 }
				 else if(sum > target){
					 if(Math.abs(target - sum) < Math.abs(diff)){
						 diff = sum - target;
						 res = sum;
					 }
					 end --;
				 }
 
				 else if(sum  == target){
					return target;
				 }
			 }
		 }
		 return res;
		
    }
	 public static ArrayList<ArrayList<Integer>> threeSum(int[] num) {
		 ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();

		 if(num.length < 3){
	    		return res;
	     }
		 
		 
		 Arrays.sort(num);
		 
		 for(int i=0; i <= num.length-3; i++){
		
			 int start = i+1;
			 int end = num.length-1;
			 
			 while(start < end){
				 ArrayList<Integer> list = new ArrayList<Integer>();
				 if(num[start] + num[end] < (-1)*num[i]){
					 start ++;
				 }
				 else if(num[start] + num[end] > (-1)*num[i]){
					 end --;
				 }
//				 [-2,0,1,1,2]
				 else if(num[start] + num[end] == (-1)*num[i]){
					 list.add(num[i]);
					 list.add(num[start]);
					 list.add(num[end]);
					 res.add(list);
					 start ++; end --;
					 if(start < end){
						 while(num[start] ==  num[start-1] && start < end){
							 start++;
							 
						 }
						 while(num[end] ==  num[end+1] && start < end){
							 end--;
						 }
					 }
				 }
				 
				 while(num[i] == num[i+1] && i < num.length -2){
					 i++;
				 }
				 
			 }
					 
		 }
		 return res;
	 }
	 
}
