package linkedList1;

public class PalindromeLinkedList {

	public static boolean isPalindrome(LinkedListNode<Integer> head) {
		//Your code goes here
        if(head==null || head.next==null)
            return true;
        LinkedListNode<Integer> mid=midNode(head);
        LinkedListNode<Integer> half=reverseList(mid.next);
        mid.next=null;
        LinkedListNode<Integer> tmp=head;
        while(half!=null)
        {
            if(!tmp.data.equals(half.data))
                return false;
            tmp=tmp.next;
            half=half.next;
        }
        return true;
	}
    
    static LinkedListNode<Integer> reverseList(LinkedListNode<Integer> head)
    {
        if(head == null) return head;
        LinkedListNode<Integer> cur=head ,pre=null, tmp=cur;
        
        while(cur!=null)
        {
            tmp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=tmp;
        }
        return pre;
    }
    
    static LinkedListNode<Integer> midNode(LinkedListNode<Integer> head){
        
        LinkedListNode<Integer> slow=head, fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

}
