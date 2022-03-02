package binarytree;

public class PreOrder_PostOrder_InOrder {

	// root -- left -- right
	public static void preOrder(BinaryTreeNode<Integer> root)
	{
		if(root==null) return;
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	// left -- right -- root
	public static void postOrder(BinaryTreeNode<Integer> root)
	{
		if(root==null) return;
		preOrder(root.left);
		preOrder(root.right);
		System.out.print(root.data+" ");
	}
	
	// left -- root -- right
	public static void inOrder(BinaryTreeNode<Integer> root)
	{
		if(root==null) return;
		preOrder(root.left);
		System.out.print(root.data+" ");
		preOrder(root.right);
		
	}
}
