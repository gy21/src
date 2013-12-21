package Chapter3;

public class tree {
	public node root;
	public tree(){
		root = null;
	}
	
	//to build up a binary search tree 
	//insert values specifically
	//return value is the root of the tree
	node insert(int val, node root){
		if(root == null){
			root = new node(val);
		}
		else{
			if(val < root.data){
				root.left = insert(val, root.left);
			}
			if(val > root.data){
				root.right = insert(val, root.right);
			}
		}
		return root;
	}
	
	//in order traversal could generate a series of number in order
	void inorderTraverse(node root){
		if(root == null)
			return;
		else{
			inorderTraverse(root.left);
			System.out.print(root.data+ " ");
			inorderTraverse(root.right);
		}
		
	}	
	
	
	//pre-order traverse
	void preorderTraverse(node root){
		if(root == null)
			return;
		else{
			System.out.print(root.data+ " ");
			preorderTraverse(root.left);
			preorderTraverse(root.right);
		}
		
	}	
	
	boolean isLeaf(node root, int val){
		if(root.left == null && root.right == null && root.data == val){
			return true;
		}
		else if(root.data < val){
		    return isLeaf(root.right, val);
		} 
		else if(root.data > val){
			return isLeaf(root.left, val);
		}
		return false;
	}
	
	boolean findNode(node root, int val){
		if(root == null){
			return false;
		}
		if(root.data == val){
			return true;
		}
		else if( root.data < val){
			return findNode(root.right,val)  ;
		}
		else if( root.data > val){
			return findNode(root.left, val);
		}
		return false;
	}
	
	int maxDepth(node root){
		if(root == null){
			return 0;
		}
//		int ldepth = maxDepth(root.left);
//		int rdepth = maxDepth(root.right);
		
		return (maxDepth(root.left) > maxDepth(root.right)?maxDepth(root.left):maxDepth(root.right))+1;
//		return (Math.max(ldepth, rdepth))+1;
	} 
	//this is WRONG!!!!!!!!!!!!!!!!!!
//	int minDepth(node root){
//		if(root == null){
//			return 0;
//		}
//		int ldepth = minDepth(root.left);
//		int rdepth = minDepth(root.right);
//		return (Math.min(ldepth, rdepth))+1;
//	}
	
	public int minDepthWrapper(node root) {
        if(root == null)
            return 0;
        return minD(root);
        
    }
    
    int minD(node root){
        if(root == null){
            return 9999999;
        }
        if(root.left == null && root.right == null)
            return 1;
        int ld = minD(root.left);
        int rd = minD(root.right);
        return Math.min(ld,rd)+1;
    }
	
	int size(node root){
		if(root == null)
			return 0;
		return size(root.left)+size(root.right)+1;
	}
	
	boolean isBalanced(node root){
		if(root == null){
			return true;
		}
		return (this.maxDepth(root.left)-this.minDepthWrapper(root.right)) <= 1 ;
	}
	
	void levelOrder(node root){
		
		if(root == null){
			return;
		}
		
	}
	
	public static void main(String args[]){
		tree t = new tree();
		node root = new node(5);
		t.root = root;
		t.insert(4, root);
		t.insert(2, root);
		t.insert(1, root);
		t.insert(7, root);
		
		t.insert(6, root);
		t.insert(3, root);
		
		t.inorderTraverse(root);
		System.out.println();
//		System.out.println(t.findNode(root, 5));
//		System.out.println(t.isLeaf(root, 2));
//		System.out.println("The max depth of this tree is : " + t.maxDepth(root));
//		System.out.println("The min depth of this tree is : " + t.minDepthWrapper(root));
//		System.out.println(t.isBalanced(root));
		System.out.println("The size of the tree is : "+ t.size(root));
//		 t.inorderTraverse(root);
		
	}
}
