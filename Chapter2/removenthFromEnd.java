package Chapter2;

public class removenthFromEnd {
	
	public node removeNthFromEnd(node head, int n) {
	    int length = 0;
	    node tmp = head;
	    node p = head;
	    
	    while(tmp != null){
	    	length++;
	    	tmp = tmp.next;
	    }
	    
	    if(length < n || head == null || n <= 0){
	        return head;
	    }
	    if( length == 2 && n == 1 ){
	        head.next = head.next.next;
	        return head;
	    }
	    else if(length == n){
	        return head.next;
	    }
	    else if( n < length){
	       
	        for(int j=0; j<length-n-1; j++){
	            p = p.next;
	        }
	        p.next = p.next.next;
	    }
	   
	    return head;
	   
	    
	}
	
	public static void main(String [] args){
		removenthFromEnd n = new removenthFromEnd();
		linkedlist l = new linkedlist();
		l.append(1);
		l.append(2);
		l.append(3);
//		l.append(4);
//		l.append(5);
//		l.append(6);
//		l.append(7);
		l.print(n.removeNthFromEnd(l.head, 3));
	}

}
