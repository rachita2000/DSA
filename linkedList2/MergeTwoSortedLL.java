package linkedList2;

public class MergeTwoSortedLL {

	public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> h1, LinkedListNode<Integer> h2) {
        if(h1==null) return h2;
        if(h2==null) return h1;
        LinkedListNode<Integer> head=null, tail=null, t1=h1, t2=h2;
        if(t1.data <= t2.data)
        {
            head= t1;
            tail=t1;
            t1=t1.next;
        }
        else {
            head=t2;
            tail=h2;
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
