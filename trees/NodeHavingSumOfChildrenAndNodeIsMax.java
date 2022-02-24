package trees;

class NodeHavingSumOfChildrenAndNodeIsMax {

	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root){
        TreeNode<Integer> ans=root;
        int sum=root.data;
        for(int i=0;i<root.children.size();i++)
        {
             sum+=(root.children.get(i).data);
        }
        for(int i=0;i<root.children.size();i++)
        {
        	TreeNode<Integer> child=maxSumNode(root.children.get(i));
        	int n=child.data;
        	for(int j=0;j<child.children.size();j++)
        		n+=child.children.get(j).data;
        	if(sum<n)
        	{
        		sum=n;
        		ans=child;
        	}
        }
        return ans;
	}
}
