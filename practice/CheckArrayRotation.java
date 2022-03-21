package practice;

public class CheckArrayRotation {
/*
 * You have been given an integer array/list(ARR) of size N. 
 * It has been sorted(in increasing order) and then rotated by some number 
 * 'K' in the right hand direction.
Your task is to write a function that returns the value of 'K', that means, 
the index from which the array/list has been rotated.*/
	
	public static int arrayRotateCheck(int[] arr){
    	
        int ans=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<arr[i-1])
            { 
                ans=i;
            	break;
            }
        }
        return ans;
    }
}
