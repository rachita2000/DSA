package dynamic_programming;

public class MaximumSquareMatrixWithAllZeros {

	public static int findMaxSquareWithAllZeros(int[][] input){
        if(input.length==0) return 0;
        int[][] dp=new int[input.length][input[0].length];
        int ans=0;
        for(int i=0;i<input.length;i++)
        {
            if(input[i][0]==0)
                dp[i][0]=1;
            else
                dp[i][0]=0;
            
            ans=Math.max(ans, dp[i][0]);
        }
        
        for(int i=0;i<input[0].length;i++)
        {
            if(input[0][i]==0)
                dp[0][i]=1;
            else
                dp[0][i]=0;
            ans=Math.max(ans, dp[0][i]);
        }
		
        for(int i=1;i<input.length;i++)
        {
            for(int j=1;j<input[0].length;j++)
            {
                if(input[i][j]!=0)
                    dp[i][j]=0;
                else
                    dp[i][j]=1+Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1]));
                
                ans=Math.max(ans, dp[i][j]);
            }
            
        }
        
        return ans;
	}
}
