package recursion1;

public class String_To_Integer {

	public static int convertStringToInt(String input){
		// Write your code here
		return convertStringToInt(input,input.length());
	}
    
    static int convertStringToInt(String input, int n)
    {
        if(n==1)
            return input.charAt(0)-'0';
       
        return 10* convertStringToInt(input, n-1) + input.charAt(n-1)-'0';
    }
}
