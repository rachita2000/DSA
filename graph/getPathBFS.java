package graph;
import java.io.IOException;
import java.util.*;
public class getPathBFS {

	public static void main(String[] args)  throws NumberFormatException, IOException{
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
        ArrayList<Integer> ans=getPathBFS(graph, visited, v1, v2);
            if(ans!=null)
            {
                for(int a:ans)
                    System.out.print(a+" ");
            }
	}
    
    public static ArrayList<Integer> getPathBFS(int[][] g, boolean[] visited, int v1, int v2)
    {
        if(v1==v2)
        {
            ArrayList<Integer> ans=new ArrayList<Integer>();
            ans.add(v1);
            visited[v1]=true;
            return ans;
        }
    	ArrayList<Integer> ans=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        Map<Integer, Integer> map=new HashMap<>();
		q.add(v1);
		visited[v1]=true;
		int n=g.length;
		while(!q.isEmpty())
		{
			int vert=q.poll();
			for(int i=0;i<n;i++)
			{
				if(g[vert][i]==1 && !visited[i])
				{
					q.add(i);
                    map.put(i, vert);
					visited[i]=true;
                    if(i==v2)
                    {
                        ans.add(i);
                        while(!ans.contains(v1))
                        {
                            int val=map.get(i);
                            ans.add(val);
                            i=val;
                        }
                        return ans;
                    }
				}
			}
		}
        return null;
    }
}
