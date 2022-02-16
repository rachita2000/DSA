package linkedList2;

public class BubbleSort {

	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
		if(head==null || head.next==null) return head;
        int len=size(head);
        for(int i=0;i<len;i++)
        {
           LinkedListNode<Integer> curr=head, prev=null, next=curr.next;
            while(curr.next!=null)
            {
                if(curr.data > curr.next.data)
                {
                    if(prev==null)
                    {
                        curr.next=next.next;
                        next.next=curr;
                        prev=next;
                        head=prev;
                    }
                    else
                    {
                        next=curr.next;
                        curr.next=next.next;
                        prev.next=next;
                        next.next=curr;
                        prev=next;
                    }
                }
                else
                {
                    prev=curr;
                    curr=curr.next;
                }
            }
        }
        return head;
        
	}
   
  static int size(LinkedListNode<Integer> head)
     {
         int size=0;
         LinkedListNode<Integer> curr=head;
         while(curr!=null)
         {
              curr=curr.next;
             size++;
         }
         return size;
     }
}
