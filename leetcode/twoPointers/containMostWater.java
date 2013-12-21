package leetcode.twoPointers;

public class containMostWater {

  public static int maxArea(int[] height) {
	  int l = 0;
	  int r = height.length - 1;
	  
	  int val = 0;
	  int res = 0;
	  
	  while(l < r){
		  int min = Math.min(height[l], height[r]);
		  val = min * (r-l);
		  
		  if(val > res){
			  res = val;
		  }
		 //如果右边是短板，就要去找比右边高的然后比较面积
		  //所以把右侧的指针往左边移动。
		  if(height[l] > height[r]){
			  int last = height[r];
			  while(last >= height[r] && l<r){
				  r--;
			  }
		  }
		  else {
			  int last = height[l];
			  while(last >= height[l] && l<r){
				  l++;
			  }
		  }
		  
		  
		  
	  }
         
        return res;
  }
  
	
//	public static int maxArea(int[] height) {
//        // Start typing your Java solution below
//        // DO NOT write main() function
//        int ans = 0;
//        int tmp = 0;
//         
//        int l = 0;
//        int r = height.length - 1;
//        while (l < r)
//        {
//            int min = Math.min(height[l], height[r]);
//            tmp = min * (r - l);
//            if (tmp > ans) ans = tmp;
//            if ( height[l] < height[r])
//            {
//                int last = height[l];
//                while (l < r && height[l] <= last)
//                {
//                    l++;
//                }
//            }
//            else
//            {
//                int last = height[r];
//                while (l < r && height[r] <= last)
//                {
//                    r--;
//                }
//            }
//        }
//        return ans;
//    }
//  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,1};
		System.out.println(maxArea(a));
	
	}

}
