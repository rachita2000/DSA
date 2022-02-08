package practice;
import java.util.*;
public class FindTheUniqueElement {

	// Approach 1
	public static int findUnique(int[] arr) {
		//Your code goes here
         Map<Integer,Integer> map=new HashMap<>();
        int count=0;
         for(int i:arr)
	    	   map.put(i, map.getOrDefault(i, 0)+1);
	       for(int i:arr)
	       {
	    	   if(map.get(i)==1)
	    		  return i;
	       }
        return 0;
	}
	
	// Approach 2
	public static int findUnique2(int[] arr) {
		//Your code goes here
        int a=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            a=a^arr[i];
        }
        return a;
	}

}
