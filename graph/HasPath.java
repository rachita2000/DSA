package graph;
import java.util.*;
public class HasPath {

	public static boolean hasPathDFS(int[][] g, int sv, int ev, boolean[] visited)
    {
        if(sv>=g.length ||ev>=g.length)
            return false;
        if( g[sv][ev]==1 || visited[ev]==true )
        	return true;
        visited[sv]=true;
        for(int i=0;i<ev;i++)
        {
        	if(!visited[i] && g[sv][i]==1)
            {
                boolean ans=hasPathDFS(g, i, ev, visited);
                if(ans==true) return true;
            }
        }
        return false;
        
    }
	
	 public static boolean hasPathBFS(int[][] g, int sv, int ev, boolean[] visited)
     {
         if(sv>=g.length ||ev>=g.length)
            return false;
         Queue<Integer> q=new LinkedList<>();
		q.add(sv);
		visited[sv]=true;
		int n=g.length;
		while(!q.isEmpty())
		{
			int vert=q.poll();
			for(int i=0;i<n;i++)
			{
				if(g[vert][i]==1 && !visited[i])
				{
					q.add(i);
					visited[i]=true;
				}
			}
		}
         if(visited[ev])
             return true;
         return false;
	 }

}
