package linkedList2;

public class MergeTwoSortedLL {

	public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        if(head1==null) return head2;
        if(head2==null) return head1;
        LinkedListNode<Integer> head=null, tail=null, t1=head1, t2=head2;
        if(t1.data <= t2.data)
        {
            head= t1;
            tail=t1;
            t1=t1.next;
        }
        else {
            head=t2;
            tail=head2;
            t2=t2.next;  
        }
        while(t1!=null && t2!=null)
        {
            if(t1.data<=t2.data)
            {
                tail.next=t1;
                tail=t1;
                t1=t1.next;
            }
            else
            {
                tail.next=t2;
                tail=tail.next;
                t2=t2.next;
            }
        }
        if(t1==null)
            tail.next=t2;
        if(t2==null)
            tail.next=t1;
        return head;        
    }
}
