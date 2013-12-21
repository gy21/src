package Chapter2;

public class reverse {

	
	node reverseLinkedList(node head){
		node p = head;
		node q = p.next;
		p.next = null;
		while(q != null){
			node m = q.next;
			q.next = p;
			p = q;
			q = m;
		}
		return p;
	}
	
	public static void main(String args[]){
		   reverse r = new reverse();
		    
			linkedlist l = new linkedlist();
			l.append(1);
			l.append(2);
			l.append(3);
			l.append(4);
			l.append(5);
		
			l.append(6);
			l.append(7);
			
			l.print(l.head);
			
			l.print(r.reverseLinkedList(l.head));
			
	}
}
