package stack_and_queue;
import java.util.*;
public class CheckRedundantBrackets {

	public static boolean checkRedundantBrackets(String expression) {
		Stack<Character> s=new Stack<>();
		for(int i=0;i<expression.length();i++)
		{
			char c=expression.charAt(i);
			if(c==')') {
				char top=s.peek();
				s.pop();
				boolean flag=true;
				while(top!='(')
				{
					if(top=='+' || top=='-' || top=='*' || top=='/')
						flag=false;
					if(!s.isEmpty()) {
					top=s.peek();
					s.pop();
					}
				}
				if(flag==true)
				return true;
			}
			else
			s.push(c);
		}
		return false;
	}
}
