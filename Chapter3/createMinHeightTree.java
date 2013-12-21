package Chapter3;


//Question 4.3
//Given a sorted array, create a binary tree with min height

//algorithm:
//Every time, we need get the middle element of the whole array

public class createMinHeightTree {
	node minHeightTree(int[] a){
		return minHeightTree(a, 0, a.length-1);
	}

   node minHeightTree(int[] a, int start, int end) {
	    
	    //1. 这里我犯错误了，我写的是如果start == end那么return root
	    //而实际上 应该是return null 且条件必须是 start > end;
	   
	   
	   //2. 其次，是递归时候p必须 一个加一  一个是减一
	   // 否则，有两种错误可能发生 递归找不到出口 和 丢失最后一个node
	    if(start > end){
	    	return null;
	    }
	    int p = (start+end)/2;
	    node root = new node(a[p]);
	    
	    root.left = minHeightTree(a, start, p-1);
	    root.right = minHeightTree(a, p+1, end);
		 
		return root;
	}
	
   public static void main(String args[]){
	   createMinHeightTree c = new createMinHeightTree();
	   int[] array = {1,2,3,4,5,6,7,8,9};
	   
	   tree t = new tree();
	   node root = c.minHeightTree(array);
	   t.inorderTraverse(root);
	
   }
}
