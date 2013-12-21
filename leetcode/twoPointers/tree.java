package leetcode.twoPointers;
 



public class tree {
	public TreeNode root;
	public tree(){
		this.root = null;
	}
	
	//to build up a binary search tree 
	//insert values specifically
	//return value is the root of the tree
	public TreeNode insert(int val, TreeNode root){
		if(root == null){
			root = new TreeNode(val);
		}
		else{
			if(val < root.val){
				root.left = insert(val, root.left);
			}
			if(val > root.val){
				root.right = insert(val, root.right);
			}
		}
		return root;
	}
	
	void preorderTraverse(TreeNode root){
		if(root == null)
			return;
		else{
			System.out.print(root.val+ " ");
			preorderTraverse(root.left);
			
			preorderTraverse(root.right);
		}
		
	}
	
	void inorderTraverse(TreeNode root){
		if(root == null)
			return;
		else{
			inorderTraverse(root.left);
			System.out.print(root.val+ " ");
			inorderTraverse(root.right);
		}
		
	}	

}
