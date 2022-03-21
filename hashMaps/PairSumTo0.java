package hashMaps;
import java.util.*;
public class PairSumTo0 {

	public static int PairSum(int[] input, int size) {
		HashMap<Integer, Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<input.length;i++)
        {
            	int k=0-input[i];
                if (map.containsKey(k)) {
                count += map.get(k);
            	}
                if(map.containsKey(input[i])){
                    map.put(input[i], map.get(input[i])+1);
                }
                else{
                    map.put(input[i], 1);
                }
            }
            return count;
        }
}
