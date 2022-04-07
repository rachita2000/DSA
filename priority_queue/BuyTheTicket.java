package priority_queue;
import java.util.*;
public class BuyTheTicket {

	
	public static int buyTicket(int input[], int k) {
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		Queue<Integer> q=new LinkedList<>();
		for(int i=0;i<input.length;i++)
		{
			q.add(i);
			pq.add(input[i]);
		}
		int count=0;
		while( !q.isEmpty() )
		{
			if(input[q.peek()] !=pq.peek())
			{
				int tmp=q.poll();
				q.add(tmp);
			}
			
			if(input[q.peek()]==pq.peek())
			{
				count++;
				pq.poll();
                if(k==q.poll())
                    break;
                
			}
			
		}
		return count;
	}
}
