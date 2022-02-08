package recursion2;

public class PrintSubset {

	public static void printSubsets(int input[]) {
		// Write your code here 
		int[] output=new int[0];
       printSubsets(input, 0, output);
	}
     static void printSubsets(int input[], int ind, int output[]) {
		if(ind>=input.length)
        {
            for(int i : output)
            System.out.print(i+" ");
            System.out.println();
            return;
        }
         printSubsets(input, ind+1, output);
         int [] newopt=new int[output.length+1];
         int j=0;
         for(;j<output.length;j++)
             newopt[j]=output[j];
         
         newopt[j]=input[ind];
			
         printSubsets(input, ind+1, newopt);
	}
}
