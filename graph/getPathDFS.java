package graph;
import java.io.IOException;
import java.util.*;
public class getPathDFS {

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
        int v1=sc.nextInt();
        int v2=sc.nextInt();
		boolean visited[]=new boolean[v];
        ArrayList<Integer> ans=getPathDFS(graph, visited, v1, v2);
            if(ans!=null)
            {
                for(int a:ans)
                    System.out.print(a+" ");
            }
	}
    
    public static ArrayList<Integer> getPathDFS(int[][] g, boolean[] visited, int v1, int v2)
    {
        if(v1==v2)
        {
            ArrayList ans=new ArrayList<>();
            ans.add(v1);
            visited[v1]=true;
            return ans;
        }
        
        visited[v1]=true;
        for(int i=0;i<g.length;i++)
        {
            if(!visited[i] && g[v1][i]==1)
            {
                ArrayList<Integer> a=getPathDFS(g, visited, i, v2);
                
                if(a!=null){
                    a.add(v1);
                    return a;
                }
            }
        }
        
        return null;
    }
    
}
