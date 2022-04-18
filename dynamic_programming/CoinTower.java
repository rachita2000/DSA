package dynamic_programming;

public class CoinTower {

	public static String findWinner(int n, int x, int y) {
		if(n==1 || n==x || n==y)
            return "Beerus";
        int []dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        int a1=0, a2=0, a3=0;
        for(int i=2;i<=n;i++)
        {
            if(i==x || i==y)
            {
                dp[i]=1;
                continue;
            }
            if(i-x >= 1)
               a1=dp[i-x] ^ 1;
           if(i-y >= 1 )
                a2=dp[i-y] ^ 1;
            
            a3=dp[i-1] ^ 1;
            
            dp[i]=Math.max(a1, Math.max(a2, a3));
        }
        
        if(dp[n]!=0)
            return "Beerus";
        else
            return "Whis";
	}
}
