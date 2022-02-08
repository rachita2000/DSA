package linkedList1;

public class PrintIthNode {

	public static void printIthNode(LinkedListNode<Integer> head, int i){
		//Your code goes here
        int count=0;
        LinkedListNode<Integer> cur=head;
        while(cur!=null && count<=i)
        {
            if(count==i)
            {
                System.out.println(cur.data);
                return;
            }
            cur=cur.next;
            count++;
        }
	}
}
