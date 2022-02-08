package recursion1;

public class Remove_X {

	public static String removeX(String input){
		// Write your code here
			if(input.length()==0)
			return "";
		if(input.charAt(0)=='x')
			return removeX(input.substring(1));
		return input.charAt(0) + removeX(input.substring(1));
	}
}
