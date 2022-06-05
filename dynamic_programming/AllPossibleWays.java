package dynamic_programming;

public class AllPossibleWays {

	public static int allWays(int x, int n) {
		
        return helper(x, n, 1);
    }
    
    static int helper(int x, int n, int num)
    {
        int val=x-(int)Math.pow(num, n);
        if(val==0) return 1;
        if(val<0) return 0;
        
        return helper(x, n, num+1) + helper(val, n , num+1);
    }
}
