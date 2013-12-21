package Chapter3;

public class checkBST {
	boolean BSTorNOT(node root){
		//exit of recursion
		if(root == null){
			return true;
		}
		if(root.data >= maxValue(root.left) &&
			root.data < minValue(root.right)){
			return BSTorNOT(root.left) && BSTorNOT(root.right);
		}
		return false;
	}
	
	int maxValue(node root){
		 
		node p = root;
		while(p.right != null){
			p = p.right;
		}
		return p.data;
	}
	
	int minValue(node root){
		node p = root;
		while(p.left != null){
			p = p.left;
		}
		return p.data;
	}
}
