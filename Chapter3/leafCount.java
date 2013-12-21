package Chapter3;

public class leafCount {
	int countLeaf(node root){
		if(root == null){
			return 0;
		}
		if(root.right == null && root.left == null){
			return 1;
		}
		return countLeaf(root.left)+countLeaf(root.right);
	}
	
	public static void main(String args[]){
		tree t = new tree();
		node root = new node(5);
		t.root = root;
		t.insert(4, root);
		t.insert(2, root);
		t.insert(1, root);
		t.insert(7, root);
		leafCount lc = new leafCount();
		t.insert(6, root);
		t.insert(3, root);
		
		t.inorderTraverse(t.root);
		System.out.println(lc.countLeaf(root));
		
	}
}
