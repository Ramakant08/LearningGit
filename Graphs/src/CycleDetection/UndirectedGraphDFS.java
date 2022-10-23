package CycleDetection;

import java.util.ArrayList;
import java.util.Arrays;

public class UndirectedGraphDFS {
    
	public static void addEdge(ArrayList<ArrayList<Integer>> adj,int v,int u) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	public static void printGraph(ArrayList<ArrayList<Integer>>adj,int vertex) {
		   for(int i=0;i<adj.size()-1;i++) {
			   System.out.print("adjecent nodes of "+i+": ");
			   for(int j=0;j<adj.get(i).size();j++) {
				  if(j==adj.get(i).size()-1)
					   System.out.println(adj.get(i).get(j));
				   else
					   System.out.print(adj.get(i).get(j)+"-->");
					   
			   }
		   }
	   }
	static boolean cycleDetect(int node,int parent,ArrayList<ArrayList<Integer>> adj,boolean visited[]) {
		visited[node]=true;
		
		for(Integer it:adj.get(node)) {
			if(visited[it]==false && cycleDetect(it,node,adj,visited))
				return true;
			else if(it!=parent)
				return true;
		}
		return false;
    }
	static boolean isCycle(ArrayList<ArrayList<Integer>> adj,int vertex) {
		boolean visited[]=new boolean[vertex+1];
		Arrays.fill(visited, false);
		for(int i=0;i<vertex;i++) {
			if(visited[i]==false) {
				if(cycleDetect(i,-1,adj,visited))
					return true;
			}
		}
		return false;
		
	}
	public static void main(String[] args) {
		int vertex=5;
		ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
		
		for(int i=0;i<vertex;i++) {
			adj.add(new ArrayList<Integer>());
		}
		
			addEdge(adj,0,1);
			addEdge(adj,1,2);
			addEdge(adj,1,3);
			addEdge(adj,3,4);
			
		System.out.println("entered graph is: ");
	    printGraph(adj,vertex);
		
		boolean var=isCycle(adj,vertex);
	    System.out.println("the graph contains cylce is: "+var);
	    
	}
	
}
