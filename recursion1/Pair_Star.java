package recursion1;

public class Pair_Star {

	public static String addStars(String s) {
		// Write your code here
		if(s.length()==1)
			return s;
		
		String a=addStars(s.substring(1));
		if (s.charAt(0)==a.charAt(0))
		return s.charAt(0)+"*"+a;
		else
			return s.charAt(0)+a;
	}
}
