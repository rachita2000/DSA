package dynamic_programming;

public class MinimumCountOfSquares {

	public static int minCount(int n) {
        if(n<=3) return n;
		int[] dp=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        dp[3]=3;
        
        for(int i=4;i<=n;i++)
        {
           dp[i]=i;
            for(int j=1;j<=(Math.sqrt(i));j++)
            {
                 int sq=j*j;
            if(sq > i) 
                break;
            else
            	dp[i]=Math.min(dp[i], 1+dp[i-sq]);
            }
        }
        return dp[n];
	}
}
