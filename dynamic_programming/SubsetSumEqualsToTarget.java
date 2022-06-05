package dynamic_programming;

public class SubsetSumEqualsToTarget {

	//Recursive
	static boolean isSubsetPresentRec(int[] arr, int n, int sum) {

		return isSubset(arr, n, sum, 0);
	}

	static boolean isSubset(int[] arr, int n, int sum, int ind) {
	
	    if(ind==n) {
	        if(sum==0) return true;
	        else
	            return false;
	    }
	    boolean op1=false, op2=false;
	    	if(arr[ind] <= sum)
	     		op1=isSubset(arr, n, sum-arr[ind], ind+1);
	     op2=isSubset(arr, n, sum, ind+1);
	     
	    return op1|op2;
	    
	}
	
	//DP
	static boolean isSubsetPresent(int[] arr, int n, int sum) {
		boolean [][]dp=new boolean[n+1][sum+1];
			
		for(int i=0;i<=n;i++) {
			dp[i][0]=true;
		}
		
		for(int i=1;i<=sum;i++)
			dp[0][i]=false;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sum;j++)
			{
				dp[i][j]=dp[i-1][j];
				if(arr[i-1] <= j)
		     		dp[i][j]=dp[i-1][j-arr[i-1]] || dp[i-1][j];
		     
			}
		}
		
		return dp[n][sum];
		
	}
}
