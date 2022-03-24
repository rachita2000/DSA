package hashMaps;
import java.util.*;
public class LongestConsecutiveSequence {

public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
        
        ArrayList<Integer> ans =new ArrayList<>();
        
        Map<Integer,Boolean>map=new HashMap<>();
        
		for(int i=0;i<arr.length;i++){
        	map.put(arr[i],true);    
        }
        
        int maxlength = 0;
        int start  = 0;
        
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])){
                 int length=0;
              	 int temp=arr[i];
                while(map.containsKey(temp)){
                    length++;
                    map.put(temp,false);
                    temp++;
                }
                int startTemp=arr[i];
                temp=arr[i]-1;
                while(map.containsKey(temp)){
                    length++;
                    map.put(temp,false);
                   startTemp=temp;
                    temp--;
                }
                
                if(length>maxlength){
                    maxlength=length;
                    start=startTemp;
                }
                else if(length==maxlength){
                    for(int j=0;j<arr.length;j++){
                        if(arr[j] == start){
                            start = start;
                            break;
                        }else if(arr[j] == startTemp){
                            start = startTemp;
                            break;
                        }
                    }
                }
            }
    	}
    	
        ans.add(start);
        ans.add((start+maxlength)-1);
         
        return ans;
  }
}
