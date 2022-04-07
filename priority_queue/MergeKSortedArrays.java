package priority_queue;
import java.util.*;
public class MergeKSortedArrays {

	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> input) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<input.size();i++)
        {
            ArrayList<Integer> a=input.get(i);
            for(int j=0;j<a.size();j++)
            {
                pq.add(a.get(j));
            }
        }
        
        ArrayList<Integer> ans=new ArrayList<>();
        while(!pq.isEmpty())
            ans.add(pq.poll());
        
        return ans;

	}

}
