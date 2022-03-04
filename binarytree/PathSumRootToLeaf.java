package binarytree;

public class PathSumRootToLeaf {

	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		
      	rootToLeafPathsSumToK(root, k , "");
	}

    private static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k, String s) {
		if(root==null) return;
        if(root.left==null && root.right==null && root.data==k)
        {
            System.out.println(s+root.data);
            return;
        }
        s=s+root.data+" ";
        
        rootToLeafPathsSumToK(root.left, k-root.data, s);
        rootToLeafPathsSumToK(root.right, k-root.data, s);
	}
}
