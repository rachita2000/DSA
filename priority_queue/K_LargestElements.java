package priority_queue;
import java.util.*;
public class K_LargestElements {

	public static ArrayList<Integer> kLargest(int input[], int k) {
		
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		ArrayList<Integer> ans=new ArrayList<>();
    	int i=0;
		while(k>0)
        {
           pq.add(input[i++]);
            k--;
        }
        for(;i<input.length;i++)
        {
            if(pq.peek() < input[i])
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
