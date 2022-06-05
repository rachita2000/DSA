package dynamic_programming;

public class MinimumNumberOfChocolates {

	public static int getMin(int arr[], int N){
        int []dp=new int[N];
        if(arr[0] <arr[1])
            dp[0]=1;
        else
            dp[0]=2;
        for(int i=1;i<N;i++)
        {
            if(arr[i]>arr[i-1])
            {
                dp[i]=dp[i-1]+1;
            }
            else
                dp[i]=1;
        }
        
        for(int i=N-2;i>=0;i--)
        {
            if(arr[i]>arr[i+1] && dp[i]<=dp[i+1])
                dp[i]=1+dp[i+1];
        }
        int sum=0;
        for(int i:dp)
        {
            sum+=i;
        }
        return sum;
    }
}
