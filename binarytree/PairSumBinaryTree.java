package binarytree;
import java.util.*;
public class PairSumBinaryTree {

	 public static void pairSum(BinaryTreeNode<Integer> root, int sum) {
	        if(root==null)
	            return;
	        int[] arr=arrayInsertion(root);
	        Arrays.sort(arr);
	        int i=0;
	        int j=arr.length-1;
	        while(i<j){
	            if(arr[i]+arr[j]==sum){
	                System.out.println(arr[i]+" "+arr[j]);
	                i++;
	                j--;}
	            else if(arr[i]+arr[j]<sum)
	                i++;
	            else 
	                j--;

	        }
	    }
	    private static int[] arrayInsertion(BinaryTreeNode<Integer> root){

	        if(root==null){
	            int[] arr=new int[0];
	            return arr;}
	        int firstData=root.data;

	            int[] jrr= arrayInsertion(root.left);

	        int[] krr= arrayInsertion(root.right);
	        int[] finalArray=new int[1+jrr.length+krr.length];
	        int k=0;
	        finalArray[k]=firstData;
	        k++;
	        for(int i=0;i<jrr.length;i++)
	        {  finalArray[k]=jrr[i];
	         k++;
	        }
	        for(int i=0;i<krr.length;i++)
	        {
	            finalArray[k]=krr[i];
	            k++;
	        }
	        return finalArray;

	    }

}
