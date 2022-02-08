package practice;

import java.util.HashMap;

public class PairSumInArray {

	public static int pairSum(int[] arr, int num) {
		//Your code goes here
        HashMap<Integer, Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(num-arr[i]))
            {
                count+=map.get(num-arr[i]);
            }
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i])+1);
            }
            else
                map.put(arr[i],1);
        }
        return count;
	}
}
