package recursion1;

public class All_Indicies_Of_Number {

	public static int[] allIndexes(int input[], int x) 
    {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		return allIndexes(input, x, 0);
        
	}
	
    static  int[] allIndexes(int input[], int x, int i)
    {
        if(i==input.length)
            return new int[0];
      
        int[] sans=allIndexes(input,x,i+1);
        if(input[i]==x)
        {
            int ans[]=new int[sans.length+1];
            ans[0]=i;
            for(int j=0;j<sans.length;j++)
            {
                ans[j+1]=sans[j];
            }
            return ans;
        }
        else
            return sans;
    }
}
