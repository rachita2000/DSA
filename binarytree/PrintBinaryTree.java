package binarytree;
import java.util.*;
public class PrintBinaryTree {

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		if(root==null)
            System.out.println("");
        Queue<BinaryTreeNode> qu=new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty())
        {
            int size=qu.size();
            while(size!=0)
            {
                BinaryTreeNode<Integer> pending= qu.peek();

                String ans=pending.data+":";
                if(pending.left!=null)
                {
                	ans=ans+"L:"+pending.left.data+",";
                	qu.add(pending.left);
                }
                else
                	ans=ans+"L:"+"-1,";
                if(pending.right!=null)
                {
                	ans=ans+"R:"+pending.right.data;
                	qu.add(pending.right);
                }
                else
                	ans=ans+"R:"+"-1";
                size--;
                qu.poll();
                System.out.println(ans);
            }   
        }
	}
}
