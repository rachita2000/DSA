package dynamic_programming;

public class KnapsackDp {

	static int knapsack(int[] weight, int[] value, int n, int maxWeight) {  
        int [][]dp=new int[n+1][maxWeight+1];
    
	    for(int i=0;i<=maxWeight;i++)
	    {
	        dp[n][i]=0;
	    }
	    for(int i=n-1;i>=0;i--)
	    {
	        for(int j=0;j<maxWeight+1;j++)
	        {
	            if(weight[i] > j)
	            {
	                dp[i][j]=dp[i+1][j];
	            }
	            else
	            {
	                int op1=dp[i+1][j];
	                int op2=value[i]+dp[i+1][j-weight[i]];
	                dp[i][j]=Math.max(op1, op2);
	            }
	        }
	    }
	    return dp[0][maxWeight];
	}
}
