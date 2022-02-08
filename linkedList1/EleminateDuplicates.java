package linkedList1;

public class EleminateDuplicates {

	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
        if(head==null || head.next==null)
            return head;
        LinkedListNode<Integer> tmp1=head;
		LinkedListNode<Integer> tmp2=head.next;
        
        LinkedListNode<Integer> newhead=head;
        while(tmp2!=null)
        {
            if(tmp1.data.equals(tmp2.data))
           		tmp2=tmp2.next;
            else {
            tmp1.next=tmp2;
                tmp1=tmp2;
            }
        }      
        tmp1.next=null;
        return newhead;
        
	}
}
