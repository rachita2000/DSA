package binarySearchTree;


public class BinarySearchTree {
	private BinaryTreeNode<Integer> root;
	
	public void insert(int data) {
		root=insertHelper(root, data);
	}
	
	public void remove(int data) {
		root=removeHelper(root, data);
	}
	
	public void printTree() {
		printHelper(root);
	}
	
	public boolean search(int data) {
		return searchHelper(root, data);
	}
	private boolean searchHelper(BinaryTreeNode<Integer> root, int data)
	{
		if(root==null) return false;
		if(root.data==data) return true;
		else if(root.data<data) 
			return searchHelper(root.right, data);
		else 
			return searchHelper(root.left, data);
	}
	private BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> root, int data){
		if(root==null)
		{
			BinaryTreeNode<Integer> newroot=new BinaryTreeNode<Integer>(data);
			return newroot;
		}
		else if(root.data>=data)
		{
			BinaryTreeNode<Integer> lefttree= insertHelper(root.left, data);
			root.left=lefttree;
		}
		else
		{
			BinaryTreeNode<Integer> righttree= insertHelper(root.right, data);
			root.right=righttree;
		}

		return root;
	}
	private BinaryTreeNode<Integer> removeHelper(BinaryTreeNode<Integer> root, int data)
	{
		if(root==null)
		{
			return null;
		}
		if(root.data==data)
		{
			if(root.left==null && root.right==null)
				return null;
			else if(root.left!=null && root.right==null)
				return root.left;
			else if(root.left==null && root.right!=null)
				return root.right;
			else {
				BinaryTreeNode<Integer> rightmin=root.right;
				while(rightmin.left!=null)
				{
					rightmin=rightmin.left;
				}
				root.data=rightmin.data;
				root.right=removeHelper(root.right, rightmin.data);
				return root;
			}
		}
		else if(root.data>data)
		{
			BinaryTreeNode<Integer> lefttree=removeHelper(root.left, data);
			root.left=lefttree;
		}
		else
		{
			BinaryTreeNode<Integer> righttree=removeHelper(root.right, data);
			root.right=righttree;
		}
		return root;
	}
	private void printHelper(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return;
		}
		System.out.print(root.data+":");
		if(root.left!=null)
			System.out.print("L"+root.left.data+",");
		if(root.right!=null)
			System.out.print("R"+root.right.data);
		System.out.println();
		printHelper(root.left);
		printHelper(root.right);
	}
}
