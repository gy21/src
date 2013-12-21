package Chapter3;

import java.util.ArrayList;
import java.util.Stack;

public class traversal {

	//another way of iteratively inorder traversal which is easier to understand
	public static ArrayList<Integer> inorderTraversal(node root) {
        if(root == null){
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        Stack<node> s = new Stack<node>();
        s.push(root);
        
        while(root.left != null){
            s.push(root.left);
            root = root.left;
        }
        
        while(!s.isEmpty()){
            node n = s.pop();
            result.add(n.data);
            if(n.right != null){
                s.push(n.right);
                while(n.right.left != null){
                    s.push(n.right.left);
                    n.right.left = n.right.left.left;
                }
            }
            
        }
        return result;}
	public static void inOrder(node root){
		Stack<node> s = new Stack<node>();
		node dummy = null;
		s.push(dummy);
		
		node p = root;
		while(!s.isEmpty()){
			if(p != null){
				s.push(p);
				p = p.left;
			}
			else{
				p = s.pop();
				if(p == null){
					return;
				}
				System.out.print(p.data + " ");
				p = p.right;
			}
		}
	}
	public static void main(String[] args) {
		tree t = new tree();
		node root = new node(5);
		t.root = root;
		t.insert(4, root);
		t.insert(2, root);
		t.insert(1, root);
		t.insert(7, root);
		
		t.insert(6, root);
		t.insert(3, root);
		
//		traversal.inOrder(root);
		System.out.println(inorderTraversal(root));
	}

}
