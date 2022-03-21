package hashMaps;
import java.util.*;
public class MaximumFrequencyNumber {

	 public static int maxFrequencyNumber(int[] arr){ 
			HashMap<Integer, Integer> map=new HashMap<>();
	        for(int i:arr)
	        {
	            if(map.containsKey(i))
	            map.put(i, map.get(i)+1);
	            else
	                map.put(i, 1);
	        }
	        
	        int max=map.get(arr[0]);
		        int ans=arr[0];
		        for(int i=1;i<arr.length;i++){
		               if(map.get(arr[i])>max){
		                   max=map.get(arr[i]);
		                   ans=arr[i];
		               }
		        }
		        return ans;
	    }
}
