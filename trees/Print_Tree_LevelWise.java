package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Print_Tree_LevelWise {

	public static TreeNode<Integer> takeInputLevelWise(){
		Queue<TreeNode<Integer>> q=new LinkedList<>();
		Scanner sc=new Scanner (System.in);
		int root=sc.nextInt();
		TreeNode<Integer> rootNode=new TreeNode<>(root);
		q.add(rootNode);
		while(!q.isEmpty())
		{
			TreeNode<Integer> node=q.poll();
			int childnum=sc.nextInt();
			for(int i=0;i<childnum;i++)
			{
				int child=sc.nextInt();
				TreeNode<Integer> childnode=new TreeNode<>(child);
				q.add(childnode);
				node.children.add(childnode);
				}
		}
		return rootNode;
	}
	
	public static void printLevelWise(TreeNode<Integer> root){
		 Queue<TreeNode<Integer>> q=new LinkedList<>();
		System.out.println(root.data);
        q.add(root);
		while(!q.isEmpty())
		{
            int size = q.size();
            System.out.println("size "+ size);
            while(size!=0){
                TreeNode<Integer> nextnode=q.poll();
                for(int i=0;i<nextnode.children.size();i++)
                {
                    System.out.print(nextnode.children.get(i).data+" ");
                    q.add(nextnode.children.get(i));
                }
                size--;
            }
			System.out.println();
            
		}
	}
		
	public static void main(String[] args) {
		TreeNode<Integer> root=takeInputLevelWise();
		printLevelWise(root);
	}
}
