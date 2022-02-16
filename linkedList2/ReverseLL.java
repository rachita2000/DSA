package linkedList2;

public class ReverseLL {

	// recursive
	public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head) {
		if(head==null || head.next==null) return head;
        LinkedListNode<Integer> tail=head.next;
        LinkedListNode<Integer> finalnode = reverseLinkedListRec(head.next);
        tail.next=head;
        head.next=null;
        return finalnode;
	}
	
	// iterative
	public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head){
        if(head==null || head.next==null) return head;
        LinkedListNode<Integer> cur=head, pre=null, tmp=null;
        while(cur!=null)
        {
            tmp=cur.next;
             cur.next=pre;
            pre=cur;
            cur=tmp;
        }
        return pre;
	}
}
