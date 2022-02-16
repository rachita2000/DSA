package stack_and_queue;
import java.util.*;
public class StackSpan {

	public static int[] stockSpan(int[] price) {
		Stack<Integer> s=new Stack<>();
        int ans[] =new int[price.length];
        s.push(0);
        ans[0]=1;
        int i;
        for(i=1;i<price.length;i++)
        {
            while(!s.isEmpty() && (price[s.peek()]<price[i]))
            {
               s.pop();
            }
           
            if(s.isEmpty())
                ans[i]=i+1;
            else
                ans[i]=i-s.peek();
            
            s.push(i);
        }
        
        return ans;
	}
}
