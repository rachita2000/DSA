package priority_queue;

import java.util.PriorityQueue;

public class KthLargestElement {

	public static int kthLargest(int n, int[] input, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for(int i=0;i<n;i++){
            pq.add(input[i]);
        }
        for(int i=0;i<n;i++){
            input[i]=pq.poll();
        }
        return input[n-k];

	}
}
