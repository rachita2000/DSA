package linkedList2;

public class KReverse {

	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
		if(k==0 || k==1) return head;
		if(head==null) return head;
		int c=1;
		LinkedListNode<Integer> curr=head;
		LinkedListNode<Integer> pre=null, temp=null;
		while(c<=k && curr!=null)
		{
			temp=curr.next;
			curr.next=pre;
			pre=curr;
			curr=temp;
			c++;
		}
		
		if(temp!=null)
			head.next=kReverse(temp, k);
		
        return pre;
	}
	
}
