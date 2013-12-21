package Chapter3;

public class MirrorTree {
	void mirror(node r){
		if(r == null)
			return;
		else{
			mirror(r.left);
			mirror(r.right);
			node tmp = r.right;
			r.right = r.left;
			r.left = tmp;
		}
	}
	
	public static void main(String [] args){
		tree t = new tree();
		node root = new node(20);
		t.root = root;
		t.insert(8, root);
		t.insert(4, root);
		t.insert(12, root);
		t.insert(10, root);
		
		t.insert(14, root);
		t.insert(22, root);
		
		t.inorderTraverse(root);
		System.out.println();
		MirrorTree mt = new MirrorTree();
		mt.mirror(root);
		t.inorderTraverse(root);
	}
}
