package graph;
import java.util.*;
public class PrimsAlgorithm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E = sc.nextInt();

		int[][] input=new int[V][V];
        for(int i=0;i<E;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int w=sc.nextInt();
            input[a][b]=w;
            input[b][a]=w;
        }
        
        boolean visited[]=new boolean[V];
        int weight[]=new int[V];
        int parent[]=new int[V];
        
        weight[0]=0;
        for(int i=1;i<V;i++)
        {
            weight[i]=Integer.MAX_VALUE;
        }
        
        for(int i=0;i<V;i++)
        {
            int vert=minVert(weight, visited);
            visited[vert]=true;
            
            for(int j=0;j<V;j++)
            {
                if(input[vert][j]!=0 && !visited[j])
                {
                    if(input[vert][j]<weight[j])
                    {
                        weight[j]=input[vert][j];
                        parent[j]=vert;
                    }
                }
            }
        }
        
        for(int i=1;i<V;i++){
                if(parent[i]<i){
                    System.out.println(parent[i]+" "+i+" "+weight[i]);
                }else{
                     System.out.println(i+" "+parent[i]+" "+weight[i]);
                }
         }
	}
    
    public static int minVert(int[] weight, boolean visited[])
    {
        int vert=-1;
        
        for(int i=0;i<weight.length;i++)
        {
            if(!visited[i] && (vert==-1|| weight[i]<weight[vert]))
                vert=i;
        }
        
        return vert;
    }
}
