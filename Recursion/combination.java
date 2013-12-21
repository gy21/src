package Recursion;

import java.util.ArrayList;

//Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
//
//For example,
//If n = 4 and k = 2, a solution is:
//
//[
// [2,4],
// [3,4],
// [2,3],
// [1,2],
// [1,3],
// [1,4],
//]
 








public class combination {
	 static ArrayList<ArrayList<Integer>> combine(int n, int k) {
		    
		    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		   // if(n == 0 || k == 0) return res;
		    if( k == 1)	{
		    	
		    	for(int i=1; i<=n; i++){
		    		ArrayList list = new ArrayList<Integer>();
		    		list.add(i);
		    		res.add(list);
		    	}
		    	
		    	return res;
		    }
		    	
		    else{
		    	  for(int i =n;i>1;i--){
		                ArrayList<ArrayList<Integer>> comb = combine(i-1,k-1);
		                for(ArrayList<Integer> sub: comb){
		                    sub.add(i);
		                    res.add(sub);
		                }
		            }
		    }
		    return res;
		}

	public static void main(String[] args) {
		 System.out.println(combine(4,2));

	}

}
