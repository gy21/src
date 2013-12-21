package leetcode.twoPointers;
 


public class LinkedList {
	ListNode head = null;
	
	ListNode append(int val){
		ListNode newListNode = new ListNode(val);
		if(this.head == null){
			this.head = newListNode;
			return this.head;
		}
		ListNode p = this.head;
		while(p.next != null){
			p = p.next;
		}
		p.next = newListNode;
		return head;
	}
	
	
	void print(ListNode head){
		ListNode p = head;
		while( p!= null){
			System.out.print(p.val + " ");
			p = p.next;
		}
		System.out.println();
	}
	
}