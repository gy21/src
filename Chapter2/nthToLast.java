// 9/19/2013 8:10am
package Chapter2;

public class nthToLast {
	
	node returnNtoLast(node head, int n){
		node p = head;
		node q = head;
		for(int i=0; i < n; i++){
			q = q.next;
		}
		
		while (q != null){
			q = q.next;
			p = p.next;
		}
		
		return p;
	}
 
	public static void main(String args[]){
		
		linkedlist l = new linkedlist();
		l.append(4);
		l.append(5);
		l.append(1);
		l.append(2);
		l.append(3);
	
		l.append(6);
		l.append(7);
		
		l.print(l.head);

		nthToLast n = new nthToLast();
		System.out.println(n.returnNtoLast(l.head, 1).data);
		 
	}

}
