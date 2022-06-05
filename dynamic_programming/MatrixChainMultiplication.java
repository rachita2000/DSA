package dynamic_programming;

public class MatrixChainMultiplication {

	
	//Recursive
	static int helperRec(int[] p, int i, int j)
    {
        if(i==j) return 0;
        int min=Integer.MAX_VALUE;
        for(int k=i;k<j;k++)
        {
            int steps=(p[i-1]*p[k]*p[j])+helperRec(p, i, k)+helperRec(p, k+1, j);
            min=Math.min(min, steps);
        }
        
        return min;
    }

	//Memorization
	public static int mcmMemo(int[] p){
		int n=p.length;
        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                dp[i][j]=-1;
        }
		return helperMemo(p, 1, n-1, dp);
    }

    static int helperMemo(int[] p, int i, int j, int[][]dp)
    {
        if(i==j) return dp[i][j]=0;
       	if(dp[i][j]!=-1) return dp[i][j];
        int min=Integer.MAX_VALUE;
        for(int k=i;k<j;k++)
        {
            int steps=(p[i-1]*p[k]*p[j])+helperMemo(p, i, k, dp)+helperMemo(p, k+1, j, dp);
            min=Math.min(min, steps);
        }
        
        return dp[i][j]=min;
    }
}
