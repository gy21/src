package Chapter2;

//merge two sorted linked list
public class mergeTwoLinkedList {
	//iterative  a dummy node is greatly helpful
	
	
	 public static node mergeTwoLists(node l1, node l2) {
	        if(l1 == null) return l2;
	        if(l2 == null) return l1;
	        node p = l1;
	        node q = l2;
	        node h = new node(0) ;
	        node cur = h;
	        //制造了一个傻子头结点；没有什么作用；只不过用来存储位置
	        while(p!=null && q!=null){
	            if(p.data < q.data){
	                cur.next = p;
	                p = p.next;
	            }
	            else {
	                cur.next = q;
	                q = q.next;
	            }
	            cur = cur.next;
	        }
	        
	        if(p != null) {
	            cur.next = p;
	        }
	        else if(q != null){
	            cur.next = q;
	        }
	        //
	        return h.next;
	        
	    }
	
	public static void main(String[] args){
		linkedlist l1 = new linkedlist();
		linkedlist l2 = new linkedlist();
		l1.append(2);
		l2.append(1);
		
		linkedlist l = new linkedlist();
		
		l.print(mergeTwoLinkedList.mergeTwoLists(l1.head, l2.head));
	}
}
