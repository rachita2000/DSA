package dynamic_programming;

public class ShortestSubsequence {

	//Recursive
	public static int solveRec(String s,String v){
		if(s.length()==0)
	         return 1001;
	        
	        if(v.length()<=0)
	            return 1;
	        int k;
	        for(k=0;k<v.length();k++)
	        {
	        	if(v.charAt(k)==s.charAt(0))
	        		break;
	        }
	        if(k==v.length()) 
	        	return 1;
	   
	        return Math.min(solveRec(s.substring(1), v), 1+solveRec(s.substring(1),v.substring(k+1)));
		}
    
    //Memoization
	
	public int solveM(String s,String v){
		int[][] dp=new int[s.length()+1][v.length()+1];
        
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<v.length();j++)
            {
                dp[i][j]=-1;
            }
        }
        
        return helperM(s, v, dp, 0, 0);
    }
    
    int helperM(String s, String v, int[][] dp, int si, int vi)
    {
        if(s.length()==0)
        {
            dp[0][vi]=1001;
            return dp[0][vi];
        }
        if(v.length()<=0)
        {
            dp[si][0]=1;
        	return dp[si][0];
        }
        if(dp[si][vi]!=-1)
            return dp[si][vi];
        int k;
        for(k=0;k<v.length();k++)
        {
            if(v.charAt(k)==s.charAt(0))
                break;
        }
        if(k==v.length())
        {
            dp[si][vi]=1;
        	return dp[si][vi];
        }
        int op1=helperM(s.substring(1), v, dp, si+1, vi);
        int op2=1+helperM(s.substring(1), v.substring(k+1), dp, si+1, vi+k+1);
        
        dp[si][vi]=Math.min(op1, op2);
        
        return dp[si][vi];
    }
}
