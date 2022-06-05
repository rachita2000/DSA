package graph;
import java.io.IOException;
import java.util.*;
public class IsConnected {

	public static void main(String[] args) throws NumberFormatException, IOException {
	       Scanner sc=new Scanner(System.in);
	        int v=sc.nextInt();
	        int e=sc.nextInt();
	        int[][] graph=new int[v][v];
	        for(int i=0;i<e;i++)
	        {
	            int si=sc.nextInt();
	            int ei=sc.nextInt();
	            graph[si][ei]=1;
	            graph[ei][si]=1;
	        }
	        
	        boolean visited[]=new boolean[v];
	        isConnected(graph, 0, visited);
	        boolean ans=true;
	        for(int i=0;i<v;i++)
	        {
	            if(!visited[i])
	                ans=false;
	        }
	        
	        System.out.println(ans);
		}
	    
	    public static void isConnected(int[][] g, int si, boolean visited[])
	    {
	        if(g.length==0) return;
	        visited[si]=true;
	        int n=g.length;
			for(int i=0;i<n;i++)
			{
				if(g[si][i]==1 && !visited[i])
					isConnected(g,i, visited);
			}
	    }

}
