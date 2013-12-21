package leetcode.twoPointers;

import java.util.ArrayList;
import java.util.HashMap;

public class maxPointsinLine {
	
	 public static int maxPoints(Point[] points) {
		 if(points.length == 0 || points.length == 1)
			 return points.length;
		 
		 HashMap<ArrayList<Integer>, Integer> h = new HashMap<ArrayList<Integer>, Integer> ();
	 
		 for(int i=0; i<points.length-1; i++){
			 
		 	for(int j=i+1; j<points.length; j++){
		   
		 		Point two = points[j];
		 		Point one = points[i];
		 		
		 		ArrayList<Integer> arr = new ArrayList<Integer> ();
		 		  
		 		if(two.x == one.x || two.y == one.y){
		 		    //here k is 0;
		 		    if(two.y == one.y){
		 		        arr.add(0);
		 		        arr.add(two.y);
		 		    }
		 		    //here k is max of int
		 		    else if(two.x == one.x){
		 		        arr.add(Integer.MAX_VALUE);
		 		        arr.add(one.x);
		 		    }
		 		}
		 		else{
		 		    int k = (two.y - one.y)/(two.x-one.x);
    		 		int b = one.y - k * one.x;
    		 		arr.add(k);
    		 		arr.add(b);
		 		}
		 		
		 		h.put(arr, 0);
		 	}
		 }
		 
		 System.out.println(h);
		 
	 	int res = Integer.MIN_VALUE;
	 	
	 	for(int m=0; m<points.length; m++){
	 		for(ArrayList<Integer> a:h.keySet()){
	 			if(a.get(0) == Integer.MAX_VALUE){
	 				if(points[m].x == a.get(1)){
	 					int freq = h.get(a);
	 					freq++;
	 					h.put(a, freq);
	 				}
	 			}
	 			else if(points[m].x * a.get(0) + a.get(1) == points[m].y){
	 				int freq = h.get(a);
 					freq++;
 					h.put(a, freq);
	 			}
	 		}
	 	}
	 	
	 	for(ArrayList<Integer> k:h.keySet()){
	 		if(h.get(k) > res){
	 			res = h.get(k);
	 		}
	 	}
	 	
		 return res;
	 }
	 
	 
	 public static void main(String[] args) {
		 
		
		Point[] points = new Point[4];
		
		points[0] =  new Point(3,1);
		points[1] = new Point(12,3);
		points[2] = new Point(3,1);
		points[3] = new Point(6,-1);
		
		System.out.println(maxPoints(points));
		
		

	}

}
