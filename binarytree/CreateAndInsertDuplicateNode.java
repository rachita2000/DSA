package binarytree;

public class CreateAndInsertDuplicateNode {

	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		if(root==null) return;
        
        insertDuplicateNode(root.left);
        insertDuplicateNode(root.right);
        
        BinaryTreeNode<Integer> oldLeft=root.left;
        root.left=new BinaryTreeNode<Integer>(root.data);
        root.left.left=oldLeft;
	}
}
