package binarytree;

public class NodesWithoutSibling {

	public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
		if(root==null) return;
        if(root.left==null && root.right!=null) System.out.print(root.right.data+" ");
        else if(root.left!=null && root.right==null) System.out.print(root.left.data+" ");
        printNodesWithoutSibling(root.left);
        printNodesWithoutSibling(root.right);
	}
}
