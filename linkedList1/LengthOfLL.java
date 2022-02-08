package linkedList1;

public class LengthOfLL {

	public static int length(LinkedListNode<Integer> head){
		//Your code goes here
        LinkedListNode<Integer> cur=head;
        int count=0;
        while(cur!=null)
        {
            cur=cur.next;
            count++;
        }
        return count;
	}
}
