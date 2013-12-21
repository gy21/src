package leetcode.twoPointers;

import Chapter2.node;

public class addTwoNumbersinLinkedList {

  public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	  if(l1 == null)	return l2;
	  if(l2 == null)	return l1;
	  
	  ListNode p = l1;
	  ListNode q = l2;
	  int carry = 0;
	  ListNode h = new ListNode(0);
	  ListNode res = h;
	  
	  while( p!= null && q != null){
		  int val = p.val + q.val + carry;
		  
		  h.next = new ListNode((val) % 10 );
		  carry = val/10;
		   
		  p = p.next; 
		  q = q.next;
		  h = h.next;
	  }
	  
	  while( q!= null){
		  int val = q.val + carry;
		  h.next = new ListNode((val)%10);
		  carry = val/10;
		  q = q.next;
		  h = h.next;
	  }
	  
	  while( p!= null){
		  int val = p.val + carry;
		  h.next = new ListNode((val)%10);
		  carry = val/10;
		  p = p.next;
		  h = h.next;
	  }
	  
	  if(carry == 1){
		  h.next = new ListNode(1);
	  }
	  
	  return res.next;
        
  }
  
  
  
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		l1.append(3);
		l1.append(7);
//		l1.append(9);
//		l1.append(9);
//		l1.append(9);
//		l1.append(9);
//		l1.append(9);
		
		l2.append(9);
		l2.append(2);
//		l2.append(6);
//		l2.append(9);
//		
		l1.print(l1.head);
		l1.print(l2.head);
		
		l1.print(addTwoNumbers(l1.head, l2.head));
		
		
	}

} 
