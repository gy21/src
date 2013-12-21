package Recursion;
import java.util.*;

public class AllSubSets {
	
	static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> a){
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

		if(a.isEmpty()){
			ArrayList<Integer> m = new ArrayList<Integer>();
			result.add(m);
			return result;
		}
		
		int first = a.remove(0);
		ArrayList<ArrayList<Integer>> remain = subsets(a);
		for(ArrayList<Integer> sub : remain){
			ArrayList<Integer> m = new ArrayList<Integer>();
			m.addAll(sub);
			m.add(first);
			result.add(sub);
			result.add(m);
		}
		return result;
	}
	
	
	public static void main(String[] args){
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		System.out.println(AllSubSets.subsets(a));
		 
	}

}
