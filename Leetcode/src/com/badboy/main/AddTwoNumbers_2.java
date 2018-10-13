package com.badboy.main;

public class AddTwoNumbers_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode list = new ListNode(9) ;
		list.next = new ListNode(2) ;
		list.next.next = new ListNode(3) ;
		list.next.next.next = new ListNode(3) ;
		list.next.next.next.next = new ListNode(3) ;
		
		ListNode list2 = new ListNode(9) ;
		list2.next = new ListNode(2) ;
		list2.next.next = new ListNode(3) ;
		
		ListNode result = new AddTwoNumbers_2().addTwoNumbers(list, list2) ;
		while(result!=null) {
			System.out.println(result.val);
			result = result.next ;
		}
	}

	/**
	 * 主要是要考虑进位的问题
	 * @param l1
	 * @param l2
	 * @return
	 */
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode list = null ;
		ListNode last = null ;

		int pre = 0 ;
		while(l1!=null || l2!=null || pre!=0) {
			int val = pre;
			if(l1!=null) {
				val+=l1.val ;
				l1 = l1.next ;
			}
			if(l2!=null) {
				val+=l2.val ;
				l2 = l2.next ;
			}
			
			
			int val1 = val%10 ;
			int val2 = val/10 ;
			
			if(list == null ) {
				list = new ListNode(val1) ;
				last = list ;
			}else {
				last.next = new ListNode(val1) ;
				last = last.next ;
			}
			pre = val2 ;
		}
		
		
		return list ;
    }
}


class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}