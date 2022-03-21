package stack_and_queue;

import java.util.Stack;

public class MinimumBracketReversal {


	public static int countBracketReversals(String input) {
		if(input.length()%2!=0) return -1;
		
        Stack<Character> s=new Stack<>();
        int count=0;
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)=='{') 
                s.push('{');
            else {
          	  if(s.isEmpty() &&  input.charAt(i)=='}') 
                  s.push('}');
              else if(!s.isEmpty() && s.peek()=='{') 
                  s.pop();
              else if(!s.isEmpty() && s.peek()!='{') 
                  s.push('}');
                }
        }
        while(!s.isEmpty())
        {
            char c1=s.pop();
            char c2=s.pop();
            if(c1==c2) count++;
            else count=count+2;
        }
        return count;
	}

}
