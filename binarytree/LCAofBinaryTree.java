package binarytree;

public class LCAofBinaryTree {

	static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
		if(root==null) return -1;
        if(root.data.equals(a) || root.data.equals(b)) return root.data;
        
        int x=getLCA(root.left, a,b);
        int y=getLCA(root.right, a, b);
        if(x==a || x==b )
        {
            if(y==-1)
                return x;
            else 
                return root.data;
        }
       else if(y==a || y==b)
        {
            if(x==-1)
                return y;
            else 
                return root.data;
        }
        else
            return -1;
		
	}
}
