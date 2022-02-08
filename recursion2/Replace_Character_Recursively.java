package recursion2;
/*
 *Given an input string S and two characters c1 and c2, 
 *you need to replace every occurrence of character c1 with character c2 in the given string. 
 */
public class Replace_Character_Recursively {

	public static String replaceCharacter(String input, char c1, char c2) {
		
		if(input.length()==1)
        {
            if(input.charAt(0)==c1)
                return Character.toString(c2);
            else return input;
        }
    String ans="";
    if(input.charAt(0) != c1)
        ans=ans+input.charAt(0);
    else 
        ans=ans+c2;
    String sans=replaceCharacter(input.substring(1), c1,c2);
    return ans+sans;
            
    
}
}
