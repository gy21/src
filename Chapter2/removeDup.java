package Chapter2;

public class removeDup {
	
	node removeDuplicatenodes(node head){
		node p = head;
		
		while(p.next != null ){
			node q = p;
			while( q.next != null){
				if(q.next.data == p.data){
					q.next = q.next.next;
				}
				else{
					q = q.next;
				}
			}
//			//the following line is designed for the linkedlist with all the same value
			if(p.next != null){
				p = p.next;
			}			
		}
		return head;
	}
	
	 node remove(node head){
		 node p = head;
		 
		 while(p != null){
			 node q = p;
			 node m = q.next;
			 
			 while(m != null){
				 if(m.data == p.data){
					 m = m.next;
					 q.next = m;
				 }
				 else{
					 m = m.next;
					 q = q.next;
				 }
			 }
//			 if(p.next != null){
				 p = p.next;
//			 }
		 }
		 return head;
	 }
	 public static void main(String [] args){
		    removeDup r = new removeDup();
		    
			linkedlist l = new linkedlist();
			l.append(1);
			l.append(5);
			l.append(5);
			l.append(2);
			l.append(5);
		
//			l.append(3);
//			l.append(5);
			
//			l.print(l.head);
		    l.print(r.remove(l.head));
	 }
}
