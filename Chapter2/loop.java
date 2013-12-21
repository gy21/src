package Chapter2;

//9/19 detect if a linked list has loop and get the starting point of a linked list

public class loop {
	
	
	boolean looporNot(node head){
		node p = head;
		node q = head;
		while( q!=null&& q.next != null){
			q = q.next.next;
			p = p.next;
		    //以前忽略了这个地方，以后需要注意。
            if(q == null ){
                break;
            }
            if(q.data == p.data){
                return true;
            }
			 
		}
	 
		
		return false;
	}
	
	
	//find the starting point of the loop
	//when the first meet, leave one fast there and put the slow one in the head of 
	//the list... when the two nodes meet the second time, that is the starting point 
	//of the loop.
	node startingPoint(node head){
		node p = head;
		node q = head;
		while( q.next != null && q!=null){
			q = q.next.next;
			p = p.next;
			if(p.data == q.data){
				q = head;
				break;
			}
		}
		while( q != null){
			p = p.next;
			q = q.next;
			if(q.data == p.data){
				return q;
			}
		}
		return null;
	}
	
	public static void main(String args[]){
			
			node n1 = new node(1);
			node n2 = new node(2);
//			node n3 = new node(3);
//			node n4 = new node(4);
//			node n5 = new node(5);
//			
			n1.next = n2;
			n2.next = null;
//			n3.next = n4;
//			n4.next = n5;
	
			loop loop = new loop();
			System.out.println(loop.looporNot(n1));
			System.out.println(loop.startingPoint(n1).data);
			 
	}
	
}
