package Chapter2;

public class linkedlist {
	
	node head = null;
	linkedlist(){
		
	}
	
	
	node append(int val){
		node newnode = new node(val);
		if(this.head == null){
			this.head = newnode;
			return this.head;
		}
		node p = this.head;
		while(p.next != null){
			p = p.next;
		}
		p.next = newnode;
		return head;
	}
	
	node removeNode(node head, int val){
		
		if(head.data == val){
			return head.next;
		}
		node p = head;
		while (p.next != null){
			// here is p.next but not p
			if(p.next.data == val){
				p.next = p.next.next;
			}
			p = p.next;
		}
		return head;
	}
	
	void print(node head){
		node p = head;
		while( p!= null){
			System.out.print(p.data + " ");
			p = p.next;
		}
		System.out.println();
	}
}
