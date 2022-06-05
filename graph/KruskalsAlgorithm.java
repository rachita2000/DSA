package graph;
import java.util.*;
public class KruskalsAlgorithm {
	public static int parentcall(int[] parent,int vertex){
        if(vertex==parent[vertex])
            return  vertex;
        return parentcall(parent,parent[vertex]);
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E = sc.nextInt();
		
        Edge[] input=new Edge[E];
        for(int i=0;i<E;i++)
        {
            int s=sc.nextInt();
            int d=sc.nextInt();
            int w=sc.nextInt();
            input[i]=new Edge(s,d,w);
            //System.out.println(input[i].source+" "+input[i].destination+" "+input[i].weight);
        }
        Arrays.sort(input);
       
        Edge[] output=new Edge[V-1];
        
        int parent[]=new int[V];
        for(int i=0;i<V;i++)
        {
            parent[i]=i;
        }
        
        int count=0,k=0;
        while(count!=V-1)
        {
            Edge e=input[k];
            int v1=e.source;
            int v2=e.destination;
            int sp=parentcall(parent, v1);
            int dp=parentcall(parent, v2);
            if(sp!=dp)
            {
                output[count++]=e;
                parent[sp]=dp;
            }
            k++;
        }
        
        for(int i=0;i<V-1;i++){
            if(output[i].source<=output[i].destination)
                System.out.println(output[i].source+" "+output[i].destination+" "+output[i].weight);
            else
                System.out.println(output[i].destination+" "+output[i].source+" "+output[i].weight);
        }
	}
     
}

class Edge implements Comparable<Edge> {
 
    int source;
    int destination;
	int weight;
    
    public Edge(int s, int d, int w)
    {
        source=s;
        destination=d;
        weight=w;
    }
    
		public int compareTo(Edge o){
        	return this.weight-o.weight;
        }
    
}