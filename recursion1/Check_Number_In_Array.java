package recursion1;

public class Check_Number_In_Array {

	public static boolean checkNumber(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        if(input[0]==x || input[input.length-1]==x )
            return true;
        if(input.length==1)
            return false;
        int tmp[]=new int[input.length-1];
       
        for(int i=0;i<tmp.length;i++)
            tmp[i]=input[i];
         boolean result=checkNumber(tmp,x);
        return result;
	}
}
