package trees;

public class ContainsX {

	public static boolean checkIfContainsX(TreeNode<Integer> root, int x){
	      boolean ans=false;
	        if(root==null) return false;
	        if(root.data==x) return true;
	        for(int i=0;i<root.children.size();i++)
	        {
	         	boolean sans= checkIfContainsX(root.children.get(i), x);
	            if(sans!=ans && sans==true) 
	                ans=sans;
	        }
			
	        return ans;
		}
}
