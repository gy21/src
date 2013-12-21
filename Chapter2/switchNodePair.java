package Chapter2;

//from 1 2 3 4
// to 2 1 4 3
public class switchNodePair {
	
	static node switchPair(node head){
		if(head == null || head.next == null) 
			return head;
		node p = head;
		node newhead = head.next;
		while(p != null && p.next != null){
			node q = p.next;
			node m = q.next;
			q.next = p;
			if(m != null){
				if(m.next != null){
					p.next = m.next;
				}
				else{
					p.next = m;
					m.next = null;
					break;
				}
				
			}
			else{
				p.next = null;
			}
			p=m;
	}	
		return newhead;
	}
	
	public static void main(String [] args){
		linkedlist l = new linkedlist();
		l.append(1);
		l.append(2);
		l.append(3);
		l.append(4);
		l.append(5);
		l.append(6);
		l.append(7);
		
		l.append(8);
//		l.append(9);
		
//		l.print(l.head);
		l.print(switchPair(l.head));
	}

}
