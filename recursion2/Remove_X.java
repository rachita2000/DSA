package recursion2;

public class Remove_X {
	public static String removeX(String input){
		// Write your code here
		if(input.length()==0)
		return input;
        String ans="";
        if(input.charAt(0)!='x')
            ans=ans+input.charAt(0);
        String sans=removeX(input.substring(1));
        return ans+sans;
	}
}
