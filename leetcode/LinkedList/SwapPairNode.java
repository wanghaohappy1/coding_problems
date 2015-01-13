//swap adjacent pair nodes


public class SwapPairNode{
	public ListNode swapPairs(ListNode head){
		if(head == null){
			return null;
		}else if(head.next == null){
			return head;
		}

		//result list
		ListNode res = head;
		ListNode resCurr = ;
		//pointers to adjacent nodes
		ListNode prev = head;
		ListNode nxt = head.next;

		while(prev!=null && next!=null){
			//swap
			prev.next = nxt.next;
			nxt.next = prev;
			//first time swapping
			if(res == null){
				res = nxt;




		}


	}
}