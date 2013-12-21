package leetcode.twoPointers;

import java.util.Stack;


public class FlattenBTtoLinkedlist {

	//	Given a binary tree, flatten it to a linked list in-place. 
	
	 public static void flatten(TreeNode root) {
        
		 Stack<TreeNode> s = new Stack<TreeNode>();
         TreeNode prev = null;
		 s.push(root);
		 while(!s.isEmpty()){
			 TreeNode current = s.pop();
			 if(current.right != null) s.push(current.right);
			 if(current.left != null) s.push(current.left);
			 
//			 if(!s.isEmpty()){
//				 //这行并没有处理左节点；
//				 
////				 current.right = new TreeNode(s.peek().val);
//			 }
			 if(prev != null){
				 prev.right = current;
				 prev.left = null;
				 
			 } 
			 prev = current;
		 }
	}
	 
	public static void main(String[] args) {
		tree t = new tree();
		TreeNode root = new TreeNode(5);
		t.root = root;
		t.insert(4, root);
		t.insert(2, root);
		t.insert(1, root);
		t.insert(7, root);
		
		t.insert(6, root);
		t.insert(3, root);
//		
//		t.inorderTraverse(root);
//		
		flatten(root);
		t.preorderTraverse(root);
		
	}

}
