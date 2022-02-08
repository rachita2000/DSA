package recursion2;

public class PrintSubsetSumToK {

	public static void printSubsetsSumTok(int input[], int k) {
		// Write your code here
        int [] opt=new int[0];
		 printSubsetsSumTok(input, k, 0,opt);
	}
    static void printSubsetsSumTok(int input[], int k, int ind, int[] output) {
		if(ind==input.length)
        {
            if(k==0)
            {
                for(int i : output)
                System.out.print(i+" ");
                System.out.println();
                return;
            }
            else
                return;
        }
        printSubsetsSumTok(input, k, ind+1, output);
        int[] newopt= new int[output.length+1];
      
        int j=0;
        for(; j<output.length;j++)
        {
            newopt[j]=output[j];
        }
        newopt[j]=input[ind];
         printSubsetsSumTok(input, k-input[ind], ind+1, newopt);
		
	}
}
