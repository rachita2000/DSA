package graph;
import java.util.*;
public class DijkstrasAlgorithm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E = sc.nextInt();

		int [][] input=new int[V][V];
        for(int i=0;i<E;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int w=sc.nextInt();
            input[a][b]=w;
            input[b][a]=w;
        }
        
        boolean visited[]=new boolean[V];
        int distance[]=new int[V];
        distance[0]=0;
        for(int i=1;i<V;i++)
            distance[i]=Integer.MAX_VALUE;
        
        for(int j=0;j<V;j++)
        {
            int vert=minVert(distance, visited);
            visited[vert]=true;
            
            for(int i=0;i<V;i++)
            {
                if(!visited[i] && input[vert][i]!=0){
                int curDis=distance[vert]+input[vert][i];
                if(distance[i]>curDis)
                    distance[i]=curDis;
                }
            }
        }
        
        for(int i=0;i<V;i++)
        {
            System.out.println(i+" "+distance[i]);
        }
	}
    public static int minVert(int[] distance, boolean visited[])
    {
        int vert=-1;
        
        for(int i=0;i<distance.length;i++)
        {
            if(!visited[i] && (vert==-1|| distance[i]<distance[vert]))
                vert=i;
        }
        
        return vert;
    }
}
