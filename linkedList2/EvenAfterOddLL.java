package linkedList2;

public class EvenAfterOddLL {

	public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
		if(head==null || head.next==null)return head;
        LinkedListNode<Integer> tmp=head, evenHead=null, evenTail=null, oddHead=null, oddTail=null;
        while(tmp!=null)
        {
            if((tmp.data)%2==0)
            {
                if(evenHead==null && evenTail==null)
                {
                    evenHead=tmp;
                    evenTail=tmp;
                }
                else
                {
                    evenTail.next=tmp;
                    evenTail=tmp;
                }
            }
            else
            {
                if(oddHead==null && oddTail==null)
                {
                    oddHead=tmp;
                    oddTail=tmp;
                }
                else
                {
                    oddTail.next=tmp;
                    oddTail=tmp;
                }
            }
            tmp=tmp.next;
        }
        if(evenHead!=null) 
            evenTail.next=null;
        if(oddHead!=null)
            oddTail.next=evenHead;
        else
            return evenHead;
        return oddHead;
            
	}
}
