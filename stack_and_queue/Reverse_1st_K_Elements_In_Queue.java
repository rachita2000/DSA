package stack_and_queue;
import java.util.*;
public class Reverse_1st_K_Elements_In_Queue {


	public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
      if(input.isEmpty() || k>input.size())
          return input;
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<k;i++)
            s.push(input.poll());
        
        while(!s.isEmpty())
            input.add(s.pop());
        
        for(int i=0;i<input.size()-k;i++)
        	input.add(input.poll());
        
        return input;
	}
}
