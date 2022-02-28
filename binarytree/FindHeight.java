package binarytree;

public class FindHeight {

	public static int height(BinaryTreeNode<Integer> root) {
		if(root==null) return 0;
        int max=Math.max(height(root.left), height(root.right));
        return max+1;
	}
}
