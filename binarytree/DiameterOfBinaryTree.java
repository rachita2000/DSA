package binarytree;

public class DiameterOfBinaryTree {

	public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
        int diameter[]=new int[1];
        diameterOfBinaryTree(root, diameter);
        return diameter[0];
	}

	private static int diameterOfBinaryTree(BinaryTreeNode<Integer> root, int[] diameter) {
		if(root==null) return 0;
		int lh=diameterOfBinaryTree(root.left, diameter);
		int rh=diameterOfBinaryTree(root.right, diameter);
		
		diameter[0]=Math.max(diameter[0], 1+lh+rh);
		return 1 + Math.max(lh, rh);		
	}
	
}
