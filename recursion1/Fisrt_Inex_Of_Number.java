package recursion1;

public class Fisrt_Inex_Of_Number {

	public static int firstIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		return firstIndex(input, x, 0);
	}
	
     static int firstIndex(int input[], int x, int i)
     {
         if(i>input.length-1)
             return -1;
         if(input[i]==x)
             return i;
         else 
             return firstIndex(input, x, i+1);
     }
}
