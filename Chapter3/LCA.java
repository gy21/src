package Chapter3;

public class LCA {
	
	boolean cover(node root, node n){
		if(root == null){
			return false;
		}
		if(root.data == n.data){
			return true;
		}
		return cover(root.left, n) || cover(root.right, n);
	}
	
	node findtheLCA(node root, node n1, node n2){
		if(cover(root.left, n1) && cover(root.left, n2)){
			return findtheLCA(root.left, n2, n1);
		}
		else if(cover(root.right, n1) && cover(root.right, n2)){
			return findtheLCA(root.right, n2, n1);
		}
		return root;
	}

}
