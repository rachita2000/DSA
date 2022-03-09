package binarySearchTree;

import java.util.ArrayList;

public class FindPathInBST {

	public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
		if(root==null)
            return null;
        if(root.data==data)
        {
            ArrayList<Integer> ar=new ArrayList<Integer>();
            ar.add(root.data);
            return ar;
        }
        
        if(root.data>data)
        {
            ArrayList<Integer> lefttree= getPath(root.left, data);
            if(lefttree!=null)
         	lefttree.add(root.data); 
            return lefttree;
        }
        else if(root.data<data)
        {
            ArrayList<Integer> righttree=getPath(root.right, data);
            if(righttree!=null)
                righttree.add(root.data);
            return righttree;
        }
        else
            return null;
	}
}
