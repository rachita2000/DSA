package recursion2;

public class ReturnSubsetOfAnArray {

	public static int[][] subsets(int input[]) {
		// Write your code here
		return  subsets(input, 0);
	}
    static int[][] subsets(int input[] ,int ind)
    {
        if(ind>=input.length)
        {
            int [][] ans=new int[1][0];
            return ans;
        }
       int [][] sans=subsets(input, ind+1);
        int [][] ans=new int[2*sans.length][];
        int x=0;
        for(int i=0;i<sans.length;i++)
        {
            ans[i]=new int[sans[i].length];
            for(int j=0;j<sans[i].length;j++)
            {
                ans[i][j]=sans[i][j];
            }
            x++;
        }
          for(int i=0;i<sans.length;i++)
        {
            ans[x+i]=new int[sans[i].length+1];
              ans[x+i][0]=input[ind];
            for(int j=1;j<=sans[i].length;j++)
            {
                ans[x+i][j]=sans[i][j-1];
            }
        }
        return ans;
    }
}
