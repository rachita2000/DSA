package binarySearchTree;

public class ReplaceWithSumOfGreaterNodes {

	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
		if(root == null){
            return;
        }
        helper(root ,0);
        
		
	}
    public static int helper(BinaryTreeNode<Integer> root ,int sum){
        if(root == null){
            return 0;
        }
        
        int right = helper(root.right ,sum);
        int rootdata = root.data;
        root.data = root.data + right + sum;
        int left = helper(root.left ,root.data);
        
        return rootdata + right + left;
        
    }
}
