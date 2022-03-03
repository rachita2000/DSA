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
	
	 static int max=0;
		public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
			if(root==null) return 0;
			System.out.println("max "+max);
			int leftHeight=diameterOfBinaryTree(root.left);
			int rightHeight=diameterOfBinaryTree(root.right);
			System.out.println("left "+leftHeight);
			System.out.println("right "+rightHeight);
			max=Math.max(max,leftHeight +rightHeight);
			 return 1+Math.max(rightHeight, leftHeight);
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BinaryTreeNode<Integer> root=takeInputLevelWise(sc);
		printLevelWise(root);
		System.out.println(diameterOfBinaryTree(root));
	}
}
