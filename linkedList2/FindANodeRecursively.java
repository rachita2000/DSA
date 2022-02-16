package linkedList2;

public class FindANodeRecursively {

	public static int findNodeRec(LinkedListNode<Integer> head, int n) {
    	return findNodeRec(head, n, 0);
	}

    static int findNodeRec(LinkedListNode<Integer> head, int n , int ind) {
    	if(head==null) return -1;
        
        if(head.data==n) return ind;
        int ans=findNodeRec(head.next, n, ind+1); 
            return ans;
	}
}
