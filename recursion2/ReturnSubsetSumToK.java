package recursion2;

public class ReturnSubsetSumToK {

	public static int[][] subsetsSumK(int input[], int k) {
		// Write your code here
		return subsetsSumK(input, k, 0);
	}
    static int[][] subsetsSumK(int input[], int k, int ind) {
		if(ind==input.length)
        {
            if(k==0)
            return new int[1][0];
           else
               return new int[0][0];
        }
        int opt1[][]=subsetsSumK(input, k-input[ind], ind+1);
        int opt2[][]=subsetsSumK(input, k, ind+1);
        int [][] output=new int[opt1.length+opt2.length][];
		int x=0;
        for(int i=0;i<opt1.length;i++)
        {
           output[i]=new int[opt1[i].length+1];
            output[i][0]=input[ind];
            for(int j=1;j<=opt1[i].length;j++)
                output[i][j]=opt1[i][j-1];
            x++;
        }
         for(int i=0;i<opt2.length;i++)
        {
           output[i+x]=new int[opt2[i].length];
            for(int j=0;j<opt2[i].length;j++)
                output[i+x][j]=opt2[i][j];
        }
        return output;
	}
}
