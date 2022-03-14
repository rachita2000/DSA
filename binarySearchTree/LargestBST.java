package binarySearchTree;

public class LargestBST {

	static class TreeInfo{
        int size;
        int min;
        int max;
        boolean isBst;
        TreeInfo(){
        }
        TreeInfo(int size, int min , int max, boolean isBst)
        {
            this.size=size;
            this.min=min;
            this.max=max;
            this.isBst=isBst;
        }
    }
	public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
		TreeInfo res=helper(root);
        return res.size;
	}
    private static TreeInfo helper(BinaryTreeNode<Integer> root){
        if(root==null)
            return new TreeInfo(0, Integer.MAX_VALUE, Integer.MIN_VALUE, true);
        if(root.left==null && root.right==null)
            return new TreeInfo(1, root.data, root.data, true);
        TreeInfo left=helper(root.left);
        TreeInfo right=helper(root.right);
        
        TreeInfo result=new TreeInfo();
        if(left.isBst && right.isBst && left.max < root.data && right.min > root.data)
        {
            result.min=Math.min(Math.min(left.min, right.min), root.data);
            result.max=Math.max(Math.max(left.max, right.max), root.data);
            
            result.size=1+Math.max(left.size, right.size);
            result.isBst=true;
            return result;
        }
        result.size=Math.max(left.size, right.size);
        result.isBst=false;
        return result;
    }
        
}
