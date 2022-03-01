package binarytree;

public class MirrorABinaryTree {

	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root){
		if(root==null) 
			return;
        BinaryTreeNode<Integer> tmp1=root.left;
        BinaryTreeNode<Integer> tmp2=root.right;
        root.left=tmp2;
        root.right=tmp1;
        mirrorBinaryTree(root.left);
        mirrorBinaryTree(root.right);
	}
}
