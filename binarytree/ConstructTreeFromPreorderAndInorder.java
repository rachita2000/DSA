package binarytree;
import java.util.*;
public class ConstructTreeFromPreorderAndInorder {

	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
			HashMap<Integer, Integer> map=new HashMap<>();
			for(int i=0;i<inOrder.length;i++)
				map.put(inOrder[i], i);
			
			return buildTree(preOrder, 0, preOrder.length-1, inOrder, 0 , inOrder.length-1, map);
			
		}
	
	private static BinaryTreeNode<Integer> buildTree(int[] preOrder, int pstart, int pend, int[] inOrder, int istart, int iend, HashMap<Integer, Integer> map )
	{
		if(pstart > pend || istart > iend) return null;
		
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(preOrder[pstart]);
		
		int rootFromInorder = map.get(root.data);
		int numsLeft = rootFromInorder - istart;
				
		root.left = buildTree(preOrder, pstart+1, pstart+numsLeft, inOrder , istart, rootFromInorder -1 , map);
		root.right = buildTree(preOrder, pstart+numsLeft+1, pend, inOrder, rootFromInorder+1, iend, map);
		return root;
	}
}
