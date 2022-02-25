package trees;

public class ReplaceNodeWithDepth {

public static void replaceWithDepthValue(TreeNode<Integer> root){
		
        
        if(root==null) return;
        replaceWithDepthValue(root, 0);
	}
	
    static void replaceWithDepthValue(TreeNode<Integer> root, int depth){
		
        if(root==null) return;
        root.data=depth;
        for(TreeNode node: root.children)
        {   
            replaceWithDepthValue(node, depth+1);
        }
	}
}
