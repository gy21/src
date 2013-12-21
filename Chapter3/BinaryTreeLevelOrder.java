package Chapter3;
import java.util.*;
public class BinaryTreeLevelOrder {
	public static void main(String[] args){
		tree t = new tree();
		node root = new node(1);
		t.root = root;
		t.insert(2, root);
//		t.insert(2, root);
//		t.insert(1, root);
//		t.insert(7, root);
//		
//		t.insert(6, root);
//		t.insert(3, root);
		
		BinaryTreeLevelOrder.print(BinaryTreeLevelOrder.levelOrderBottom(t.root));
//		BinaryTreeLevelOrder.levelOrderprint(t.root);
//		System.out.println();
//		BinaryTreeLevelOrder.levelOrderusingtwoqueues(t.root);
//		System.out.println(BinaryTreeLevelOrder.getNodeByLevel(t.root,2));
	}
	
	
	 static public ArrayList<ArrayList<Integer>> levelOrderBottom(node root) {
	        if(root == null)     return null;
	        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	        
	        if(root.left == null && root.right == null){
	            ArrayList<Integer> m = new ArrayList<Integer>();
	            m.add(root.data);
	            result.add(m);
	            return result;
	        }
	        
	        int height = height(root);
	       
	        
	        for(int i = height; i>=1; i--){
	            ArrayList<Integer> sub = getNodeByLevel(root, i);
	            result.add(sub);
	        }
	        return result;
	                
	    }
	static void levelOrderusingtwoqueues(node root){
		Queue<node> q1 = new LinkedList<node>();
		Queue<node> q2 = new LinkedList<node>();
		q1.add(root);
		int level = 0;
		while(!q1.isEmpty()){
			node n = q1.poll();
			System.out.print(n.data + " ");
			if(n.left != null){
				q2.add(n.left);
			}
			if(n.right != null){
				q2.add(n.right);
			}
			if(q1.isEmpty()){
				Queue<node> temp = q2;
				q2 = q1;
				q1 = temp;
				level ++;
				System.out.println("I am on level:" + level);
			}
		}
	}
	
	 public static ArrayList<Integer>  getNodeByLevel(node root, int level){
		 
	        Queue<node> q1 = new LinkedList<node>();
	        Queue<node> q2 = new LinkedList<node>();
	        q1.add(root);
	        int count = 1;
	        if(level == 1){
	        	  ArrayList<Integer> m = new ArrayList<Integer>();
	              m.add(root.data);
	              return m;
	        }
	        while(!q1.isEmpty()){
	            node n = q1.poll();
	            if(n.left != null){
	                q2.add(n.left);
	            }
	            if(n.right!= null){
	                q2.add(n.right);
	            }
	            if(q1.isEmpty()){
	                Queue<node> temp = q2;
	                q2 = q1;
	                q1 = temp;
	                count ++;
	                if(count == level){
	                	 ArrayList<Integer> result = new ArrayList<Integer>();
	                     for(node tn:q1){
	                         result.add(tn.data);
	                     }
	                     return result;
	                } 
	              
	            }
	         
	        }
	        return null;
	    
	    }
	    
	static void print(ArrayList<ArrayList<Integer>> a ){
		for(ArrayList<Integer> array: a){
			for(int i=0; i<array.size();i++){
				System.out.print(array.get(i)+" ");
			}
			System.out.println();
		}
		
	}
	
	public static int height(node root){
		if(root == null) return 0;
		return Math.max(height(root.left), height(root.right))+1;
	}
	 
	
	
	
	//use recursion
	//if no arrayList<arraylist<integer>> requirement
	public static void levelOrderprint(node root){
		for(int i=0; i<height(root); i++){
			levelprint(root,i);
			
		}
	}
	
	
	private static void levelprint(node root, int level) {
		if(root == null)	return;
		if(level == 1){
			System.out.print(root.data+" ");
		}
		else if(level > 1){
			levelprint(root.left, level-1);
			levelprint(root.right, level-1);
		}
	}
	
	
	//when we use queue we need two variables to keep track of the level 
	public static ArrayList<ArrayList<Integer>> levelOrder(node root) {
		if(root == null){
			ArrayList<Integer> a = new ArrayList<Integer>();
			ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
			result.add(a);
			return result;
		}
		
		int cur = 0;
		int next = 0;
		Queue<node> q = new LinkedList<node>();
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(root.data);
		result.add(a);
		q.add(root);
		cur++;
		ArrayList<Integer> array = new ArrayList<Integer>();
		while(!q.isEmpty()){
			node n = q.remove();
			cur --;
		
			if(n.left != null){
				q.add(n.left); 
				next++;
				array.add(n.left.data);
			}
			if(n.right != null){
				q.add(n.right);
				next++;
				array.add(n.right.data);
			}
			if(cur == 0){
				if(!array.isEmpty()){
					result.add(array);
				}
				cur = next;
				next = 0;
				//if we use clear here, the array in the result list will also be cleared.
				array = new ArrayList<Integer>();
			}
			
		}
		
		return result;
	}
}
