package recursion2;

public class PrintPermutations {

	public static void FindPermutations(String str) {
		// Write your code here
		FindPermutations(str, "");
	}
    static void FindPermutations(String str, String output) {
		// Write your code here
		if(str.length()==0)
        {
            System.out.println(output);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            String s=str.substring(0,i)+str.substring(i+1, str.length());
            FindPermutations(s, output+str.charAt(i));
        }
	}
}
