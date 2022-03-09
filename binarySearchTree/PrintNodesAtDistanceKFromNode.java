package binarySearchTree;

public class PrintNodesAtDistanceKFromNode {

	public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
		   helper(root, node, k);
		}
	    
	    private static int helper(BinaryTreeNode<Integer> root, int node, int k) {
		   if(root==null)
	           return -1;
	        if(root.data==node)
	        {
	            printNodesAtKDepth(root, k);
	            return 0;
	        }
	        
	        int leftDistance=helper(root.left, node, k);
	        if(leftDistance!=-1)
	        {
	            if(leftDistance+1==k)
	            {
	                System.out.print(root.data);
	                System.out.println();
	            }
	            else{
	                int distanceToRight=k-leftDistance-2;
	                printNodesAtKDepth(root.right, distanceToRight);
	             }
	            return 1+leftDistance;
	        }
	        int rightDistance=helper(root.right, node, k);
	        if(rightDistance!=-1)
	        {
	            if(rightDistance+1==k)
	            {
	                System.out.print(root.data);
	                System.out.println();
	            }
	            else{
	                int distanceToLeft=k-rightDistance-2;
	                printNodesAtKDepth(root.left, distanceToLeft);
	             }
	            return 1+rightDistance;
	        }
	        return -1;
		}
	    
	    private static void printNodesAtKDepth(BinaryTreeNode<Integer> root, int k)
	    {
	        if(root==null || k<0)
	            return;
	        if(k==0)
	        {   
	            System.out.print(root.data+" ");
	            System.out.println();
	            return;
	        }
	        
	        printNodesAtKDepth(root.left, k-1);
	        printNodesAtKDepth(root.right, k-1);
	        
	    }

}
