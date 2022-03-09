package binarySearchTree;

public class BSTtoSortedLL {

	public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
		Pair output=helper(root);
        return output.head;
	}
    
   	private static Pair helper(BinaryTreeNode<Integer> root) {
		if(root==null)
        {
            Pair p=new Pair();
            p.head=null;
            p.tail=null;
            return p;
        }
        Pair leftnode=helper(root.left);
        LinkedListNode<Integer> newroot=new LinkedListNode<>(root.data);
        Pair rightnode=helper(root.right);
        Pair output=new Pair();
        if(leftnode.head!=null)
        {
            output.head=leftnode.head;
            leftnode.tail.next=newroot;
        }
        else
            output.head=newroot;
        newroot.next=rightnode.head;
        if(rightnode.head==null)
        {
            output.tail=newroot;
        }
        else
            output.tail=rightnode.tail;
        
        return output;
        
	}
}


class LinkedListNode<T> { 
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
		}
	}

class Pair{
    LinkedListNode<Integer> head;
    LinkedListNode<Integer> tail;
}
