package dynamic_programming;

public class SmallestSuperSequence {

	//DP
	public static int smallestSuperSequence(String a, String b) {
        int m=a.length();
        int n=b.length();
        int[][] dp=new int[m+1][n+1];
        int ns=n;
        for(int i=0;i<n+1;i++)
        {
            dp[m][i]=ns--;
        }
        
        int ms=m;
        for(int i=0;i<m+1;i++)
        {
            dp[i][n]=ms--;
        }
        
        for(int i=m-1;i>=0;i--)
        {
            for(int j=n-1;j>=0;j--)
            {
                if(a.charAt(i)==b.charAt(j))
                    dp[i][j]=1+dp[i+1][j+1];
                else
                    dp[i][j]=1+Math.min(dp[i+1][j], dp[i][j+1]);
              
            }
        }
        
        return dp[0][0];
    }
	
	//Recursive
	public static int smallestSuperSequenceRec(String a, String b) {
	    if(a.length()==0)
	    	return b.length();
 
	  if(b.length()==0)
	      return a.length();
	 
		if(a.charAt(0)==b.charAt(0))
	       return 1+smallestSuperSequenceRec(a.substring(1), b.substring(1));
	  else
	  {
	      return 1+ Math.min(smallestSuperSequenceRec(a.substring(1), b), smallestSuperSequenceRec(a, b.substring(1)));
	  }
	}
}
