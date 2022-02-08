package recursion1;

public class Last_Index_Of_Number {

	public static int lastIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        return lastIndex(input, x, input.length-1);
	}
	static int lastIndex(int input[], int x, int j)
    {
        if(j<0)
            return -1;
        if(input[j]==x)
            return j;
        else
            return lastIndex(input, x, j-1);
    }
}
