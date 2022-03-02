package binarytree;
import java.util.*;
public class PrintBinaryTree {

	public static BinaryTreeNode<Integer> takeInputLevelWise(Scanner sc)
	{
		Queue<BinaryTreeNode<Integer>> q=new LinkedList<>();
		System.out.println("Enter the root");
		int rootdata=sc.nextInt();
		if(rootdata==-1)
			return null;
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootdata);
		q.add(root);
		while(!q.isEmpty())
		{
			BinaryTreeNode<Integer> front=q.poll();
			System.out.println("Enter the leftroot");
			int left=sc.nextInt();
			if(left!=-1)
			{
				BinaryTreeNode<Integer> lchild=new BinaryTreeNode<Integer>(left);
				q.add(lchild);
				front.left=lchild;
			}
			System.out.println("Enter the rightroot");
			int right=sc.nextInt();
			if(right!=-1)
			{
				BinaryTreeNode<Integer> rchild=new BinaryTreeNode<Integer>(right);
				q.add(rchild);
				front.right=rchild;
			}
		}
		return root;
		
	}
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		if(root==null)
            System.out.println("");
        Queue<BinaryTreeNode<Integer>> qu=new LinkedList<>();
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
	// root -- left -- right
		public static void preOrder(BinaryTreeNode<Integer> root)
		{
			if(root==null) return;
			System.out.print(root.data+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
		
		// left -- right -- root
		public static void postOrder(BinaryTreeNode<Integer> root)
		{
			if(root==null) return;
			preOrder(root.left);
			preOrder(root.right);
			System.out.print(root.data+" ");
		}
		
		// left -- root -- right
		public static void inOrder(BinaryTreeNode<Integer> root)
		{
			if(root==null) return;
			preOrder(root.left);
			System.out.print(root.data+" ");
			preOrder(root.right);
			
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BinaryTreeNode<Integer> root=takeInputLevelWise(sc);
		//printLevelWise(root);
		preOrder(root);
		System.out.println();
		postOrder(root);
		System.out.println();
		inOrder(root);
	}
}
