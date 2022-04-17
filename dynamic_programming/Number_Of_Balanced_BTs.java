package dynamic_programming;

public class Number_Of_Balanced_BTs{

	static int mod=(int) (Math.pow(10,9)+7);
	public static long balancedBTsRecur(long n){
		if(n==1) return 1L;
        
        if(n==2) return 3L;
        long x=balancedBTsRecur(n-1);
        long y=(balancedBTsRecur(n - 2));
        
        long value1=(long)(x*x) % mod;
        long value2=(long) (2*x*y) % mod;
        return (value1+value2) % mod;
	}
	
	
	public static int balancedBTsDP(int height){
        if(height==0 || height==1)
            return 1;
        if(height==2)
            return 3;
        int dp[]=new int[height+1];
        dp[0]=1;
        dp[1]=1;
        dp[2]=3;
        int mod=(int)Math.pow(10,9)+7;
        for(int i=3;i<dp.length;i++)
        {  
            long a=(long)dp[i-1]*dp[i-1];
            long b=(long)dp[i-1]*dp[i-2]*2;
            int value1=(int)(a%mod);
            int value2=(int)(b%mod);
            dp[i]=(value1+value2)%mod;
        }
        return dp[height];
	}
}
