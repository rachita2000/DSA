package binarytree;

public class MinimumAndMaximumInTheBinaryTree {

	// Approach 2
	public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
		
		if(root==null) 
        {
            return new Pair<Integer, Integer>(Integer.MAX_VALUE,Integer.MIN_VALUE); 
        }
        
        Pair<Integer,Integer> left=getMinAndMax(root.left);
        Pair<Integer,Integer> right=getMinAndMax(root.right);
        int min=Math.min(root.data, Math.min(left.minimum, right.minimum));
        int max=Math.max(root.data, Math.max(left.maximum, right.maximum));
        return new Pair<Integer, Integer>(min, max);
    }
    
	/*		Approach 1
	 * 
	 public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
			
			if(root==null) 
	        {
	            return new Pair(0,0);
	            
	        }
	        
	        return new Pair(getmin(root), getmax(root));
	    }
	    static int getmin(BinaryTreeNode<Integer> root)
	    {
	        if(root==null) return Integer.MAX_VALUE;
	        int min=root.data;
	        int l=getmin(root.left);
	        int r=getmin(root.right);
	        
	        if(min>l)
	            min=l;
	        if(min>r)
	            min=r;
	        return min;
	    }
	    static int getmax(BinaryTreeNode<Integer> root)
	    {
	        if(root==null) return Integer.MIN_VALUE;
	        int max=root.data;
	        int l=getmax(root.left);
	        int r=getmax(root.right);
	        
	        if(max<l)
	            max=l;
	        if(max<r)
	            max=r;
	        return max;
	    }
	    */
}

class Pair<T, U> {
	T minimum;
	U maximum;

	public Pair(T minimum, U maximum) {
		this.minimum = minimum;
		this.maximum = maximum;
	}

}
