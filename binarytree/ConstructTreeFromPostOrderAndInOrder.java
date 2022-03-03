package binarytree;
import java.util.*;
public class ConstructTreeFromPostOrderAndInOrder {
	
	public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<inOrder.length;i++)
			map.put(inOrder[i], i);
		
		return buildTree(postOrder, inOrder, 0, postOrder.length-1, 0, inOrder.length-1, map);
		
	}

	private static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder
		, int pstart, int pend, int istart, int iend, HashMap<Integer, Integer> map ) {
	
		if(pstart>pend || istart>iend) return null;
		int rootdata=postOrder[pend];
		
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootdata);
		
		int rootFromInorder= map.get(rootdata);
		int numsLeft= rootFromInorder - istart;
		
		root.left = buildTree(postOrder, inOrder, pstart, pstart+numsLeft-1, istart, rootFromInorder-1, map);
		
		root.right= buildTree(postOrder, inOrder, pstart+numsLeft, pend-1, rootFromInorder+1, iend, map);
		
		return root;
	}
	
}
