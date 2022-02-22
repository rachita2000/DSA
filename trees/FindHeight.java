package trees;

public class FindHeight {

	public static int getHeight(TreeNode<Integer> root){
		if(root==null) return 0;
        int height=0;
        if(root.children==null)
            return 1;
        for(int i=0;i<root.children.size();i++)
            height=Math.max(height, getHeight(root.children.get(i)));
		return height+1;
    }
}
