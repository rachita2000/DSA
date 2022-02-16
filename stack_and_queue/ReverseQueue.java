package stack_and_queue;
import java.util.*;
public class ReverseQueue {


	public static void reverseQueue(Queue<Integer> input) {
		if(input.isEmpty()) return ;
		int data=input.peek();
		input.poll();
		reverseQueue(input);
		input.add(data);
	}
}
