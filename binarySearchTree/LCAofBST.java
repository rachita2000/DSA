package binarySearchTree;

public class LCAofBST {

	public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
		if(root==null) return -1;
        //if(root.data.equals(a) || root.data.equals(b)) return root.data;
        if(a < root.data && b < root.data)
            return getLCA(root.left, a, b);
        if(a> root.data && b> root.data)
            return getLCA(root.right, a, b);
        
            return root.data;  
            
	}
}
