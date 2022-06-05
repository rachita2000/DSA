package dynamic_programming;

public class KnapsackRec {

	public static int knapsack(int[] weights, int[] values, int n, int maxWeight) {
		return knapsackhelper(weights, values, maxWeight, 0);
	}
	
    private static int knapsackhelper(int[] weights, int[] values, int maxWeight, int i) {
		if(i==weights.length || maxWeight==0)
            return 0;
        
        if(weights[i] > maxWeight) 
            return knapsackhelper(weights, values, maxWeight, i+1);
        else
        {
            int op1=values[i]+knapsackhelper(weights,values, maxWeight-weights[i], i+1);
            
            int op2=knapsackhelper(weights,values, maxWeight, i+1);
            
            return Math.max(op1, op2);
        }
	}
}
