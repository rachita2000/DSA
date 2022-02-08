package recursion1;

public class Replace_Pi {

	public static String replace(String input){
		// Write your code here
	String s="3.14";
		if(input.length()==1)
			return input;
		String tmp=input.substring(1);
		String temp=replace(tmp);
		if(input.charAt(0)=='p'&& temp.charAt(0)=='i')
			return s+temp.substring(1);
		else 
			return input.charAt(0)+temp;
	}
}
