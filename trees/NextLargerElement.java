package trees;

public class NextLargerElement {

	static TreeNode<Integer> ans=null;
	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
	
		if(root.data>n)
		{
            if((ans==null) || ans.data >root.data)
            ans=root;
		}
		for(int i=0;i<root.children.size();i++)
		{
			findNextLargerNode(root.children.get(i), n);
            
		}
		return ans;
	}
}
