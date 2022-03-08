package binarySearchTree;

public class SearchNodeInBST {

	public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
		if(root==null) return false;
        if(root.data==k) return true;
        else if(root.data>k)
            return searchInBST(root.left , k);
        else 
            return searchInBST(root.right , k);
	}
}
