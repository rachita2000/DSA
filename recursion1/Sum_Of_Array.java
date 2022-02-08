package recursion1;

public class Sum_Of_Array {

	public static int sum(int input[]) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		if(input.length==0)
            return 0;
        int tmp[]=new int[input.length-1];
        for(int i=0;i<tmp.length;i++)
            tmp[i]=input[i];
        return (input[input.length-1]+sum(tmp));
	}
}
