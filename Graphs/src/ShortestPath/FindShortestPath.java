package ShortestPath;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindShortestPath {
    static void addEdge(ArrayList<ArrayList<Integer>> adj,int v,int u) {
    	adj.get(v).add(u);
		adj.get(u).add(v);
    }
    
    public static void shortestPath(ArrayList<ArrayList<Integer>>adj,int s,int vertex) {
    	int[] dis=new int[vertex];
    	Arrays.fill(dis,-1);
    	dis[s]=0;
    	Queue<Integer> q=new LinkedList<Integer>();
    	boolean[] visited=new boolean[vertex];
    	Arrays.fill(visited, false);
    	visited[s]=true;
    	q.add(s);
    	while(q.isEmpty()==false) {
    		int u=q.poll();
    		for(int v:adj.get(u)) {
    			if(visited[v]==false) {
    				dis[v]=dis[u]+1;
    				visited[v]=true;
    				q.add(v);
    			}
    		}
    	}
    	System.out.println("shortest path for each vertex: ");
    	for(int i=0;i<vertex;i++) {
    		System.out.print(dis[i]+" ");
    	}
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> adj= new ArrayList<ArrayList<Integer>>();
			
		int vertex=7;
		for(int i=0;i<vertex;i++) {
			adj.add(new ArrayList<Integer>());
		}
		int u;
		int v;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter node(u) and adjecent vertex(v)");
		for(int i=0;i<vertex-1;i++) {
			u=sc.nextInt();
			v=sc.nextInt();
			addEdge(adj,u,v);
		}
		int s=0;
		shortestPath(adj,s,vertex);
		sc.close();

	}

}
