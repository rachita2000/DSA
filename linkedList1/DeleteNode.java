package linkedList1;

public class DeleteNode {

	public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
	
        if(head==null)
            return head;
        if(pos==0)
        {
            return head.next;
        }
        LinkedListNode<Integer> tmp=head;
        int i=0;
        
        while(i<pos-1 && tmp!=null)
        {
            tmp=tmp.next;
            i++;
        }
    	if(tmp==null)
            return head;
        if(tmp.next!=null){
        tmp.next=tmp.next.next;
        }
        return head;
	}
}
