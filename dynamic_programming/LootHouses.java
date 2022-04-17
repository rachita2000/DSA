package dynamic_programming;

public class LootHouses {

	public static int maxMoneyLooted(int[] houses) {
        if(houses.length==0) return 0;
		int []dp=new int[houses.length];
        dp[0]=houses[0];
        dp[1]=Math.max(houses[1], dp[0]);
        for(int i=2;i<houses.length;i++)
        {
            dp[i]=Math.max(houses[i]+dp[i-2] , dp[i-1]);
        }
        
        return dp[houses.length-1];
	}
}
