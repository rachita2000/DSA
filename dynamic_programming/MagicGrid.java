package dynamic_programming;

public class MagicGrid {

	public static int getMinimumStrength(int[][] grid) {
		int m=grid.length, n=grid[0].length;
        int[][] dp=new int[m][n];
        dp[m-1][n-1]=1;
        for(int i=m-2;i>=0;i--){
            int op=dp[i+1][n-1]- grid[i][n-1];
            dp[i][n-1]=op<=0 ? 1 : op;
        }
           
        
        for(int i=n-2;i>=0;i--){
            int op=dp[m-1][i+1]- grid[m-1][i];
            dp[m-1][i]=op<=0 ? 1 : op;
        }
        
        
        for(int i=m-2;i>=0;i--)
        {
            for(int j=n-2;j>=0;j--)
            {
                int tmp=Math.min(dp[i][j+1], dp[i+1][j])-grid[i][j];
                if(tmp<=0)
                    dp[i][j]=1;
                else
                    dp[i][j]=tmp;
            }
        }
//         for(int i=0;i<m;i++)
//         {
//             for(int j=0;j<n;j++)
//             	System.out.print(dp[i][j]);
//             System.out.println();
//         }
        
        return dp[0][0];
        
    }
}
