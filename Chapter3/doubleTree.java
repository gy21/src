package Chapter3;
//so the tree...
//2
/// \
//1   3
//
//is changed to...
//   2
//  / \
// 2   3
///   /
//1   3
///
//1 
public class doubleTree {
	
	//一定要注意的是，递归和复制node的顺序千万不能反了。 
	void doubleaTree(node r){
		if(r == null) return;
		doubleaTree(r.left);
		doubleaTree(r.right);
		
		node left = new node(r.data);
		node templeft = r.left;
		r.left = left;
		left.left = templeft;
		
		
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
			
			doubleTree dt = new doubleTree();
			dt.doubleaTree(root);
			t.inorderTraverse(root);
	 }
	
	

}
