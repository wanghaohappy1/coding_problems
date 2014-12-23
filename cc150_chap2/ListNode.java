/**
 * List Node implementation
 *
 */
public class ListNode{
	public ListNode prev;
	public ListNode next;
	public int data;

	public ListNode(int data){
		this.data = data;
		this.prev = null;
		this.next = null;
	}

	public ListNode(int data, ListNode prev, ListNode next){
		this.data = data;
		this.prev = prev;
		this.next = next;
	}

}