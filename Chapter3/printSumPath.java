package Chapter3;

public class printSumPath {
	
	
	
	
	
	
	public static void main(String[] args){
		printPath pp = new printPath();
		tree t = new tree();
		node root = new node(5);
		t.root = root;
		t.insert(4, root);
		t.insert(2, root);
		t.insert(1, root);
		t.insert(7, root);
		
		t.insert(6, root);
		t.insert(3, root);
		
		 
	}

}
