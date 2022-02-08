package practice;

import java.util.*;

public class DuplicateInArray {

	public static int findDuplicate(int[] arr) {
		//Your code goes here
          Map<Integer,Integer> map=new HashMap<>();
        int count=0;
         for(int i:arr)
	    	   map.put(i, map.getOrDefault(i, 0)+1);
	       for(int i:arr)
	       {
	    	   if(map.get(i)>1)
	    		  return i;
	       }
        return -1;
	}
	
	/*You have been given an integer array/list(ARR) of size N 
	 * which contains numbers from 0 to (N - 2). 
	 * Each number is present at least once. That is, if N = 5, 
	 * the array/list constitutes values ranging from 0 to 3, 
	 * and among these, there is a single integer value that is present twice.
	 *  You need to find and return that duplicate number present in the array.*/
	public static int findDuplicate2(int[] arr) {
		//Your code goes here
       int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        int ssum=((arr.length-2)*(arr.length-1))/2;
        
        return sum-ssum;
	}

}
