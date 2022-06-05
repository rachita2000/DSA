package dynamic_programming;

public class LongestIncreasingSubsequence {

	public static int lis(int arr[]) {
        int[] dp=new int[arr.length+1];
        
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            dp[i]=1;
            for(int j=i-1;j>=0;j--)
            {
                if(arr[j]<arr[i])
                   dp[i]=Math.max(dp[i], dp[j]+1);
            }
            ans=Math.max(ans, dp[i]);
        }
        
        return ans;
        
    }
}
