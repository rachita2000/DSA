package linkedList2;

public class SwapTwoNodes {

	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
		if(head==null) return head;
        if(M==0) return null;
        if(N==0) return head;
        LinkedListNode<Integer> curr=head, tmp;
        int c;
        while(curr!=null)
        {
            for(c=1;c<M && curr!=null ; c++)
            	curr=curr.next;
            if(curr==null) 
                return head;
            tmp=curr.next;
            for(c=1;c<=N && tmp!=null ; c++)
            	 tmp=tmp.next;
            curr.next=tmp;
            curr=tmp;
        }
        return head;
	}
}
