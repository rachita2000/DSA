package recursion1;

public class Check_Palindrome {

	public static boolean isStringPalindrome(String input) {
		// Write your code here
return isStringPalindrome(input, 0, input.length()-1);
    }
    static boolean isStringPalindrome(String input, int i, int j)
    {
        if(i>=j)
            return true;
        if(input.charAt(i)!=input.charAt(j))
        return false;
        return isStringPalindrome(input, i+1, j-1);
    }
}
