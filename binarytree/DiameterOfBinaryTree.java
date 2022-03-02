package binarytree;

public class DiameterOfBinaryTree {

	static int max=0;
	public static int diameter(BinaryTreeNode<Integer>  root)
	{
		if(root==null) return 0;
		int leftHeight=diameter(root.left);
		int rightHeight=diameter(root.right);
		max=Math.max(leftHeight, rightHeight);
		 return 1+max;
	}
	
}
