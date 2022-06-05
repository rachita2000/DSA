package graph;
import java.io.IOException;
import java.util.*;
public class AllConnectedComponents {

	public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc=new Scanner(System.in);
		int v=sc.nextInt();
		int e=sc.nextInt();
		int[][] graph=new int[v][v];
		for(int i=0;i<e;i++)
		{
			int fv=sc.nextInt();
			int ev=sc.nextInt();
			graph[fv][ev]=1;
			graph[ev][fv]=1;
		}
        
        List<List<Integer>> ans=connected(graph);
        if(ans!=null)
        {
            for(int i=0;i<ans.size();i++)
            {
                 List<Integer> tmp=ans.get(i);
                for(int j=0;j<tmp.size();j++){
                    System.out.print(tmp.get(j)+" ");
                }
             	System.out.println();   
            }
        }
	}
    
    public static List<List<Integer>> connected (int[][] graph)
    {
        List<List<Integer>> ans=new ArrayList<>();
        
        boolean visited[]=new boolean[graph.length];
        for(int i=0;i<visited.length;i++)
        {
            if(!visited[i])
            {
                List<Integer> tmp=new ArrayList<>();
                helper(graph, visited, i, tmp);
                Collections.sort(tmp);
                ans.add(tmp);
            }
        }
        return ans;
    }

    private static void helper(int[][] g, boolean visited[], int s, List<Integer> tmp)
    {
       	tmp.add(s);
        visited[s]=true;
        int n=g.length;
        
        for(int i=0;i<n;i++)
        {
            if(g[s][i]==1 && !visited[i])
            {
                helper(g, visited, i, tmp);
            }
        }
    }
	
}
