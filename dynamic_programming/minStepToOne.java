package dynamic_programming;

public class minStepToOne {

	public static int countMinStepsToOneRec(int n)
	{
		if(n==1) return 0;
		int op1=countMinStepsToOneRec(n-1);
		int op2=Integer.MAX_VALUE;
		int op3=Integer.MAX_VALUE;
		 if(n%3==0)
			 op3=countMinStepsToOneRec(n/3);
		 if(n%2==0)
			 op2=countMinStepsToOneRec(n/2);
		 
		 return 1+Math.min(op1, Math.min(op2, op3));
	}
	public static int countMinStepsToOneDP(int n) {
    	if(n==1) return 0;
        int[] dp=new int[n+1];
        
        dp[1]=0;
        for(int i=2;i<=n;i++)
        {
            int min=dp[i-1];
            if(i%3==0)
            {
                if(dp[i/3] < min)
                    min=dp[i/3];
            }
             if(i%2==0)
            {
                if(dp[i/2] < min)
                    min=dp[i/2];
            }
            
            dp[i]=1+min;
        }
        
        return dp[n];
    }
}
