package binarySearchTree;

public class ConvertBSTFromSortedArray {


	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
		
        return SortedArrayToBST(arr, 0, n-1);
	}
	private static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int start, int end){
		
        if(start>end) return null;
        int mid=(end+start)/2;
    	BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(arr[mid]);
    	root.left= SortedArrayToBST(arr, start, mid-1);
    	root.right=SortedArrayToBST(arr, mid+1, end);
    	
    	return root;
	}
}
