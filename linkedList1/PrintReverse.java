package linkedList1;

public class PrintReverse {

	public static void printReverse(LinkedListNode<Integer> root) {
		//Your code goes here
        if(root==null)
            return;
        printReverse(root.next);
        System.out.print(root.data+" ");
	}
}
