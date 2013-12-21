package Chapter2;

public class getMiddlenode {
	//set two pointers, p is speed 1 and q is speed 2
	//then, when q reaches the end, p is just arriving the middle node
	
	node gettheMiddlenode(node head){
		if(head == null || head.next == null){
			return head;
		}
		node p = head;
		node q = head;
		//you must remember that there are two conditions needed to be met here
		// because odd or even length is not known yet
		while( q.next != null && q.next.next != null){
			p = p.next;
			q = q.next.next;
			
		}
		return p;
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
		
		l.print(l.head);
		getMiddlenode r = new getMiddlenode();
		System.out.println(r.gettheMiddlenode(l.head).data);
		
	}
}
