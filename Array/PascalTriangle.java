package Array;
import java.util.*;



public class PascalTriangle {
	
	 public static ArrayList<ArrayList<Integer>> generate(int numRows) {
		
	         if(numRows == 0){
				 ArrayList<ArrayList<Integer>> only = new ArrayList<ArrayList<Integer>>();
				 return only;
	         }
	         if(numRows == 1){
				 ArrayList<ArrayList<Integer>> only = new ArrayList<ArrayList<Integer>>();
				 ArrayList<Integer> first = new ArrayList<Integer>();
				 first.add(1);
				 only.add(first);
				 return only;
			 }
			 
				 ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
				 ArrayList<Integer> l0 = new ArrayList<Integer>();
				 l0.add(1);
				 result.add(l0);
				 ArrayList<Integer> l1 = new ArrayList<Integer>();
				 l1.add(1);
				 l1.add(1);
				 
				 result.add(l1);
				 
				 //i is the level number
				 for(int i = 2; i < numRows; i++){
					 ArrayList<Integer> li = new ArrayList<Integer>();
					 li.add(1);
					 for(int j=1; j<i; j++){
						 li.add(result.get(i-1).get(j)+result.get(i-1).get(j-1));
					 }
					 li.add(1);
					 result.add(li);
				 }
				 
				 return result;
	 }
	 
	 static void print(ArrayList<ArrayList<Integer>> result){
		 for(int i = 0; i < result.size(); i++){
			 for(int j=0; j<result.get(i).size(); j++){
				 System.out.print(result.get(i).get(j) + " ");
			 }
			 System.out.println();
		 }
	 }
	 
	 public static void main(String[] args){
		 PascalTriangle.print(PascalTriangle.generate(12));
		 
	 }

}
