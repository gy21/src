package leetcode.twoPointers;

import java.util.ArrayList;

public class insertInterval {

	   public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
         ArrayList<Interval> result = new ArrayList<Interval>();
         if(intervals.size () == 0){
             result.add(newInterval);
             return result;
         }
         int l = intervals.size();
         
         for(int i=0; i<l; i++){
             if(intervals.get(i).start > newInterval.start){
                 intervals.add(i, newInterval);break;
             }

             else {
            	 if(i == intervals.size()-1){
            		 intervals.add(newInterval);
                	 break;
            	 }
             }
         }
     
	    Interval first = intervals.get(0);
	    int start = first.start;
	    int end = first.end;
	  
	    for(int i = 1; i < intervals.size(); i++){
	        Interval current = intervals.get(i);
	        if(current.start <= end){
	            end = Math.max(current.end, end);
	        }
	        else{
	            result.add(new Interval(start, end));
	            start = current.start;
	            end = current.end;
	        }
	    }
	        result.add(new Interval(start, end));
	        return result;
	    }
	   
	   
	   
	     
	   void print(ArrayList<Interval> a){
		   for(int i=0; i<a.size(); i++){
			   System.out.println("[" + a.get(i).start+"," + a.get(i).end + "]");
		   }
	   }
		
	   
	   
	   
	   
	   public static void main(String[] args) {
			insertInterval is = new insertInterval();
			ArrayList<Interval> a = new ArrayList<Interval>();
			
			Interval newInterval = new Interval(0,3);
			Interval i1 = new Interval(1,5);
			a.add(i1);
			
			is.print(is.insert(a, newInterval));
		}

	
}


