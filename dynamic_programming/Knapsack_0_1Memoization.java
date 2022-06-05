package dynamic_programming;

public class Knapsack_0_1Memoization {

	static int knapsack(int[] weight, int[] value, int n, int maxWeight) {  
        int [][]st=new int[n+1][maxWeight+1];
    	for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<maxWeight+1;j++)
            {
                st[i][j]=-1;
            }
        }
    return helper(weight, value, 0, maxWeight, st);
}

static int helper(int[] weight, int[] value, int ind, int maxWeight, int[][] st)
{
    if(st[ind][maxWeight] !=-1)
    {
        return st[ind][maxWeight];
    }
    if(ind==weight.length || maxWeight==0)
    {
        st[ind][maxWeight]=0;
        return st[ind][maxWeight];
    }
    
    if(weight[ind] > maxWeight)
    {
        st[ind][maxWeight]= helper(weight, value, ind+1, maxWeight, st);
    }
    else
    {
        int op1=value[ind]+helper(weight, value, ind+1, maxWeight-weight[ind], st);
        int op2=helper(weight, value, ind+1, maxWeight, st);
        
        st[ind][maxWeight]=Math.max(op1, op2);
    }
    
    return st[ind][maxWeight];
}
}
