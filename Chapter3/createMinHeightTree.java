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
	    
	    //1. �����ҷ������ˣ���д�������start == end��ôreturn root
	    //��ʵ���� Ӧ����return null ������������ start > end;
	   
	   
	   //2. ��Σ��ǵݹ�ʱ��p���� һ����һ  һ���Ǽ�һ
	   // ���������ִ�����ܷ��� �ݹ��Ҳ������� �� ��ʧ���һ��node
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
