package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutation {
	
	 public static ArrayList<ArrayList<Integer>> permute(int[] num){
			ArrayList<Integer> a = new ArrayList<Integer>();
			for(int i=0; i<num.length;i++){
				a.add(num[i]);
			}
			return permute(a);
	 }

	private static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> a) {
		if(a.size() == 0){
			 ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
			 result.add(new ArrayList<Integer>());
			 return result;
		}
		 
		 ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	     int firstEle = a.remove(0);
	     ArrayList<ArrayList<Integer>> sub = permute(a);
	     for(ArrayList<Integer> array : sub){
	    	 //attention needs to be paid here, equal sign is a must!
	    	 for(int i=0; i <= array.size(); i++){
	    		 ArrayList<Integer> newcopyArray = new ArrayList<Integer>();
	    		 newcopyArray.addAll(array);
	    		 
	    		 newcopyArray.add(i, firstEle);
	    		 result.add(newcopyArray);
	    	 }
	     }
		 return result;
	}
	
	
	static void print( ArrayList<ArrayList<Integer>> a){
		for(int i=0; i<a.size();i++){
			for(int j=0;j<a.get(i).size();j++){
				System.out.print(a.get(i).get(j));
			}
			System.out.println();
		}
	}
	
	
	
	static ArrayList<Integer> permute(String s){
		
	}
	public static void main(String[] args){
		int[] num = {1,1,2};
	
		Permutation.print(Permutation.permute(num));
	}

}
