package leetcode.twoPointers;

import java.util.ArrayList;
import java.util.Arrays;

public class subsets {

	//要求里面的元素可是升序哦！
    public static ArrayList<ArrayList<Integer>> subsets(int[] S) {
    	if(S.length == 0){
    		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>> ();
    		return res;
    	}
    	Arrays.sort(S);
    	ArrayList<Integer> arr = new ArrayList<Integer>();
    	for(int i=S.length-1; i >= 0;i--){
    		arr.add(S[i]);
    	}
    	return sub(arr);
    }
    
    
    public static ArrayList<ArrayList<Integer>> sub(ArrayList<Integer> a){
    	ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>> ();
    	
    	if(a.isEmpty()){
			ArrayList<Integer> m = new ArrayList<Integer>();
			res.add(m);
			return res;
		}

    	int first = a.remove(0);
    	ArrayList<ArrayList<Integer>> subres = sub(a);
    	
    	for(ArrayList<Integer> m:subres){
    		ArrayList<Integer> newformed = new ArrayList<Integer>();
    		newformed.addAll(m);
    		newformed.add(first);
    		res.add(newformed);
    		res.add(m);
    	}
    	return res;
    }
    
    
    
    
    
	public static void main(String[] args) {
		int[] a = {1,2,3};
		System.out.println(subsets(a));
		
	}

}
