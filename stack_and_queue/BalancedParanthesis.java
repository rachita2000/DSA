package stack_and_queue;
import java.util.*;
public class BalancedParanthesis {


    public static boolean isBalanced(String e) {
        Stack<Character> s=new Stack<>();
        int open=0, close=0;
        for(int i=0;i<e.length();i++)
        {
            if(e.charAt(i)=='(')
                open++;
            else if(e.charAt(i)==')')
                close++;
        }
        if(open!=close)
            return false;
    	for(int i=0;i<e.length();i++)
        {
            if(e.charAt(i)=='(')
                s.push('(');
             else if(s.isEmpty() && e.charAt(i)==')')
                return false;
           else  if(e.charAt(i)==')'){
                if(s.peek()=='(')
                    s.pop();
                else 
                    return false;
            }
           
        }
        return true;
    }
}
