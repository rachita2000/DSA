package trees;

public class SecondLargestElementInTree {

	// ------------- Approach 2 --------------
	static TreeNode<Integer> first=new TreeNode<Integer>(Integer.MIN_VALUE);
    static TreeNode<Integer> second=null;
	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){
      
        if(root.data>first.data)
        {
            second=first;
            first=root;
        }
        else if(root.data>second.data && root.data!=first.data)
            second=root;
        for(TreeNode node: root.children)
            findSecondLargest(node);
      
        return second;
	}
	
	/* ---------- Approach 1 ------------------------
	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){
		if(root==null) return root;
	    int max=maxNode(root).data;
	     dataChange(root, max);
	    return maxNode(root);
	  
	}
	
	static void dataChange(TreeNode<Integer> root, int x)
	{
	    if(root==null) return ;
	    if(root.data==x)
	        root.data= Integer.MIN_VALUE;
	    for(TreeNode node: root.children)
	        dataChange(node, x);
	}
	
	static TreeNode<Integer> maxNode(TreeNode<Integer> root)
	{
	    if(root==null) return root;
	    TreeNode<Integer> max=root;
	    int maxi=root.data;
	    for( int i=0;i<root.children.size();i++)
	    {
	        TreeNode<Integer> tmp=maxNode(root.children.get(i));
	        if(tmp==null) continue;
	        if(maxi<tmp.data)
	        {
	            maxi=tmp.data;
	            max=tmp;
	        }
	    }
	    return max;
	}
	
	*/

}
