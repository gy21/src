package leetcode.twoPointers;

import java.util.ArrayList;
import java.util.Arrays;

public class threeSum {
	
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
	 
	 public static void main(String[] args){
		 int[]a = {-1 ,0 ,1, 2, -1, -4};
		 int[]b = {0,0,0};
		 int[] c={-2,0,1,1,2};

		 System.out.println(threeSum(c));
	 }
}
