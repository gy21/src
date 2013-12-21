package Array;
//Suppose a sorted array is rotated at some pivot unknown to you beforehand. 
//(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
//How do you find an element in the rotated array efficiently? 
//You may assume no duplicate exists in the array.


// this is more general than binary search
// as it works for both rotated and non-rotated arrays.
// 10/17/13

public class sortedRotatedArray {
	
	static boolean searchinsortedRotatedArray(int[] a,int key){
		int start = 0;
		int end = a.length -1;
		
		while(start <= end){
			//to avoid overflow concerns same result as (start+end)/2;
			int mid = start + (end-start)/2;
			if(a[mid] == key)	return true;
			//the left half is sorted
			if(a[start] <= a[mid]){
				if(a[start] <= key && key <= a[mid]){
					end = mid - 1;
				}
				else{
					start = mid +1;
				}
			}
			else{
				if(a[mid] <= key && key <= a[end]){
					start = mid+1;
				}
				else{
					end = mid - 1;
				}
			}
		}
		return false;
	}
	
	//11/4/2013
	//this one will return the index of the target value and this one is asked in Groupon interview
	 public static int search(int[] A, int target) {
	        int l=0;
	        int r = A.length-1;
	        while(l <= r){
	            int mid = l+(r-l)/2;
	            if(A[mid] == target){
	                return mid;
	            }
	            else{
	            	//here we have a equal sign
	                if(A[l] <= A[mid]){
	                    if(A[l] <= target && target <= A[mid]){
	                        r = mid -1;
	                    }
	                    else{
	                        l = mid+1;
	                        
	                    }
	                }
	                else {
	                    if(A[mid] <= target && target <= A[r]){
	                        l = mid + 1;
	                    }
	                    else{
	                        r = mid - 1;
	                    }
	                }
	            }
	        }
	        return -1;   
	    }
	public static void main(String[] args){
		int [] a = {6, 7, 8, 1, 2, 3};
//		for(int i=0; i<8;i++){
//			System.out.println(sortedRotatedArray.searchinsortedRotatedArray(a, i));
//		}
		System.out.println(search(a,7));
	}
}
