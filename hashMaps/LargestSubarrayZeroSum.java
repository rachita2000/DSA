package hashMaps;
import java.util.*;
public class LargestSubarrayZeroSum {

	public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
		HashMap<Integer, Integer> map=new HashMap<>();
        int maxlength=0;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum==0)
                maxlength=i+1;
            if(map.containsKey(sum))
                maxlength=Math.max(maxlength, i-map.get(sum));
            else
                map.put(sum,i);
        }
        
        return maxlength;
	}
}
