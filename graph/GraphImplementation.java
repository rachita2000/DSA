package graph;
import java.util.*;
public class GraphImplementation {

	public static void main(String[] args) {
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
		
		System.out.println("DFS");
		DFS(graph);
		
		System.out.println("BFS");
		BFS(graph);
	}
	
	private static void DFSHelper(int[][] g, boolean[] visited, int sv)
	{
		System.out.print(sv+" ");
		visited[sv]=true;
		int n=g.length;
		for(int i=0;i<n;i++)
		{
			if(g[sv][i]==1 && !visited[i])
				DFSHelper(g, visited, i);
		}
	}
	
	public static void DFS(int[][] g)
	{
		int n=g.length;
		boolean[] visited=new boolean[n];
		for(int i=0;i<n;i++)
		{
			if(!visited[i])
				DFSHelper(g, visited, i);
		}
	}
	
	private static void BFSHelper(int[][] g, int sv, boolean[] visited)
	{
		Queue<Integer> q=new LinkedList<>();
		q.add(sv);
		visited[sv]=true;
		int n=g.length;
		while(!q.isEmpty())
		{
			int vert=q.poll();
			System.out.print(vert+" ");
			for(int i=0;i<n;i++)
			{
				if(g[vert][i]==1 && !visited[i])
				{
					q.add(i);
					visited[i]=true;
				}
			}
		}
	}
	
	public static void BFS(int[][] g)
	{
		int n=g.length;
		boolean[] visited=new boolean[n];
		for(int i=0;i<n;i++)
		{
			if(!visited[i])
				BFSHelper(g,i,visited);
		}	
	}
}
