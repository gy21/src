package leetcode.twoPointers;

import java.util.ArrayList;
//Given a triangle, find the minimum path sum from top to bottom. 
//Each step you may move to adjacent numbers on the row below.
//I didn;t notice the adjancent number requirement Here only right and straight can be regarded as adjacent
//For example, given the following triangle
//
//[
//     [2],
//    [3,4],
//   [6,5,7],
//  [4,1,8,3]
//]

public class triangle {
	public static int minimumTotal(ArrayList<ArrayList<Integer>> t) {
		int first = t.get(0).get(0);

		ArrayList<ArrayList<Integer>> c = new ArrayList<ArrayList<Integer>> ();
		ArrayList<Integer> f = new ArrayList<>();
		f.add(first);
		c.add(f);
		
		for(int i=1; i < t.size(); i++){
			ArrayList<Integer> sub = new ArrayList<>();
			for(int j=0; j<t.get(i).size(); j++){
				if(j == 0){
					sub.add(j, c.get(i-1).get(j) + t.get(i).get(j));
				}
				else if(j == t.get(i).size()-1){
					sub.add(j, c.get(i-1).get(j-1) + t.get(i).get(j));
				}
				else{
					int min  = Math.min(c.get(i-1).get(j-1), c.get(i-1).get(j));
					sub.add(j, min+t.get(i).get(j));
				}
			}
			c.add(sub);
		}
		
		int minres = c.get(c.size()-1).get(0);
		for(Integer k : c.get(c.size()-1)){
			if(k < minres){
				minres = k;
			}
		
		}
		
		return minres;

	}
	public static void main(String[] args){
		
		 ArrayList<ArrayList<Integer>> res =  new ArrayList<ArrayList<Integer>> ();
		 ArrayList<Integer> a1 = new ArrayList<Integer>();
		 ArrayList<Integer> a2 = new ArrayList<Integer>();
		 ArrayList<Integer> a3 = new ArrayList<Integer>();
		 ArrayList<Integer> a4 = new ArrayList<Integer>();
		
		 a1.add(-1);
		 a2.add(2);
		 a2.add(3);
		 a3.add(1);
		 a3.add(-1);
		 a3.add(-3);
//		 a4.add(1);
//		 a4.add(9);
//		 a4.add(6);
//		 a4.add(7);
		 
		 res.add(a1);
		 res.add(a2);
		 res.add(a3);
//		 res.add(a4);
		 
		 System.out.println(minimumTotal(res));
	}

}
