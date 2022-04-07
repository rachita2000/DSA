package priority_queue;
import java.util.*;
public class K_SmallestElements {

	public static ArrayList<Integer> kSmallest(int n, int[] input, int k) {
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Integer> ans=new ArrayList<>();
        
        int i=0;
        while(k>0)
        {
            pq.add(input[i++]);
            k--;
        }
        
        for(;i<n;i++)
        {
            if(pq.peek() > input[i])
            {
                pq.poll();
                pq.add(input[i]);
            }
        }
        
        while(! pq.isEmpty())
        {
            ans.add(pq.poll());
        }
        return ans;

	}
}
