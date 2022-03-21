package hashMaps;
import java.util.*;
public class PrintIntersections {

	public static void printIntersection(int[] arr1,int[] arr2){
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i:arr1)
		{
			if(map.containsKey(i))
				map.put(i, map.get(i)+1);
			else
				map.put(i, 1);
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			if(map.containsKey(arr2[i]))
			{
				if(map.get(arr2[i]) != 0)
				{
					System.out.println(arr2[i]);
					map.put(arr2[i], map.get(arr2[i])-1);
				}
				else
					continue;
			}
			
		}
	}
	
	
}
