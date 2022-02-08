package recursion2;

public class Remove_Duplicates_Recursively {

	public static String removeConsecutiveDuplicates(String s) {
		if(s.length()==1)
            return s;
        String ans="";
        if(s.charAt(0)==s.charAt(1))
            ans=ans+removeConsecutiveDuplicates(s.substring(1));
        else
            ans=ans+s.charAt(0)+removeConsecutiveDuplicates(s.substring(1));
		return ans;
	}
}
