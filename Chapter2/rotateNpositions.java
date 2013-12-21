package Chapter2;

public class rotateNpositions {
	
	 public node rotateRight(node head, int n) {
     	if(head == null){
	            return head;
	        }
	        int length = 0;
	        node tmp = head;
	        
	        while(tmp != null){
	        	length++;
	        	tmp = tmp.next;
	        }
	 
	        if(n > length){
	        	n = n % length;
	        }       
	        
	        if(length == 1 || n == 0 || n == length){
	        	return head;
	        }
	      
	        node p = head;
	        node q = head;
	        for(int i=0; i<n;i++){
	            q = q.next;
	        }
	        while(q.next != null){
	            q = q.next;
	            p = p.next;
	        }
	        node newHead = p.next;
	        
	        p.next = null;
	        q.next = head;
	        
	        return newHead;
     
 }
	  
	 public static void main(String [] args){
		 	linkedlist l = new linkedlist();
			l.append(1);
			l.append(2);
			l.append(3);
			l.append(4);
			l.append(5);
			l.print(l.head);
			rotateNpositions rnp = new rotateNpositions();
			
			l.print(rnp.rotateRight(l.head, 10));
	 }
	 

}
