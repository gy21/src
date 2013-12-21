package Chapter3;
import java.util.*;

public class InOrderTravNoRecursion {
	//这个方法非常地好记住
	static void InorderTraverse(node root){
		if(root == null){
			return ;
		}
		Stack<node> s = new Stack<node>();
		s.push(root);
		
		while(root.left != null){
			s.push(root.left);
			root = root.left;
		}
		
		while(!s.isEmpty()){
			node n = s.pop();
			System.out.print(n.data+" ");
			if(n.right != null){
				s.push(n.right);
				while(n.right.left != null){
					s.push(n.right.left);
					n.right.left = n.right.left.left;
				}
			}
		}
	}
	
	public static void main(String[] args){
		tree t = new tree();
		node root = new node(5);
		t.root = root;
		t.insert(4, root);
		t.insert(2, root);
		t.insert(1, root);
		t.insert(7, root);
		
		t.insert(6, root);
		t.insert(3, root);
		InOrderTravNoRecursion.InorderTraverse(root);
	}
	
	
}
