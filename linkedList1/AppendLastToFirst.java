package linkedList1;

public class AppendLastToFirst {

	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
        if(head==null || n==0)
            return head;
        int c=0;
        LinkedListNode<Integer> tmp=head;
        while(tmp !=null)
        {
            tmp=tmp.next;
            c++;
        }
        //System.out.println(c);
        int p=c-n;
        tmp=head;
        while(p>1)
        {
            tmp=tmp.next;
            p--;
        }
        //System.out.println(tmp.data);
        LinkedListNode<Integer> newnode= tmp.next;
       // System.out.println(newnode.data);
        tmp.next=null;
        //System.out.println(tmp.data);
        LinkedListNode<Integer> temp=newnode;
       
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        // System.out.println(temp.data);
        temp.next=head;
        return newnode;
	}

}
