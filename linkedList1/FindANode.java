package linkedList1;

public class FindANode {

	public static int findNode(LinkedListNode<Integer> head, int n) {
		// Write your code here.
         int pos=0;
        LinkedListNode<Integer> tmp=head;
        while(tmp!=null){
            if(tmp.data==n)
            {
                return pos;
            }
            tmp=tmp.next;
            pos++;
           
        }
         return -1;
	}
}
