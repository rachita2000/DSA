package dynamic_programming;

import java.util.Scanner;

public class MinimumCostPath {

	public static int minCostPathRec(int[][] input) {
		return minCostPathRec(input, 0, 0);
        
	}
    static int minCostPathRec(int[][] input, int i, int j) {
    	int n=input.length;
    	int m=input[0].length;
    	if(i==n-1 && j==m-1) return input[i][j];
		if(i>=n || j>=m) return Integer.MAX_VALUE ;
        
        int op1=minCostPathRec(input, i+1, j);
        int op2=minCostPathRec(input, i, j+1);
        int op3=minCostPathRec(input, i+1, j+1);
        return input[i][j]+Math.min(op1, Math.min(op2, op3));
	}
    
    public static int minCostPathDP(int[][] input) {
		int n=input.length;
		int m=input[0].length;
		int[][] dp=new int[n][m];
		dp[n-1][m-1]=input[n-1][m-1];
		
		//Last row
		for(int j=m-2;j>=0;j--)
		{
			dp[n-1][j]=input[n-1][j]+dp[n-1][j+1];
			//System.out.println(dp[n-1][j]);
		}
		
		//Last col
		for(int i=n-2;i>=0;i--)
		{
			dp[i][m-1]=input[i][m-1] + dp[i+1][m-1];
			System.out.println(dp[i][m-1]);
		}
		
		//now filling remaining row and col
		for(int i=n-2;i>=0;i--)
		{
			for(int j=m-2;j>=0;j--)
			{
				dp[i][j]= input[i][j] + Math.min(dp[i][j+1], Math.min(dp[i+1][j], dp[i+1][j+1]));
				System.out.println(dp[i][j]);
			}
		}
		
		return dp[0][0];
		
	}
    public static void main(String[] args) {
    	Scanner sc=new Scanner (System.in);
    	int n=sc.nextInt();
    	int m=sc.nextInt();
		int[][]ar =new int[n][m];
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		//System.out.println(minCostPathRec(ar));
		System.out.println(minCostPathDP(ar));
	}
}
