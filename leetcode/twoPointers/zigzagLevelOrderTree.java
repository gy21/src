package leetcode.twoPointers;

import java.util.ArrayList;
import java.util.Stack;

import Chapter3.node;
import Chapter3.tree;

public class zigzagLevelOrderTree {

	  public static ArrayList<ArrayList<Integer>> zigzagLevelOrder(node root) {
	        boolean flag = false;
	        Stack<node> s1 = new Stack<>();
	        Stack<node> s2 = new Stack<>();

	        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
	        if(root == null){
	        	return res;
	        }
	        
	        s1.push(root);
	        ArrayList<Integer> arr = new ArrayList<>();
        	
	        while(!s1.isEmpty()){
	        	node m = s1.pop();
		        
	        	arr.add(m.data);
	        	
	        	if(flag){
	        		if(m.right != null)	{s2.push(m.right);}
	        		if(m.left != null)	{s2.push(m.left);}
	        	}
	        	
	        	else if(!flag){
	        		if(m.left != null)	{s2.push(m.left);}
	        		if(m.right != null)	{s2.push(m.right);}
	        	}
	        	
	        	if(s1.isEmpty()){
	        		flag = !flag;
	        		
	        		Stack<node> temp = new Stack<>();
	        		temp = s1;
	        		s1 = s2;
	        		s2 = temp;
	        		res.add(arr);
	        		
	        		arr = new ArrayList<Integer>();
	        	}
	        }
	        
		  return res;
		  
		  
		  
	  }
	private static void swap(Stack<node> s1, Stack<node> s2) {
	
	}
	public static void main(String[] args) {
		tree t = new tree();
		node root = new node(1);
		t.root = root;
//		t.insert(2, root);
//		t.insert(2, root);
//		t.insert(1, root);
//		t.insert(7, root);
//		
//		t.insert(6, root);
//		t.insert(3, root);
		
		System.out.println(zigzagLevelOrder(root));
		
		

	}

}
