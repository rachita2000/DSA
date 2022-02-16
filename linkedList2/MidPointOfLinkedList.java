package linkedList2;

public class MidPointOfLinkedList {

	public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        //Your code goes here
        if(head==null || head.next==null) return head;
        LinkedListNode<Integer> slow=head, fast =head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
