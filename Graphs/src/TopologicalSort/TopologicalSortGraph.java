package TopologicalSort;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSortGraph {
	
	static void addEdge(ArrayList<ArrayList<Integer>> adj, int i, int j) {
		
		adj.get(i).add(j);
		
	}
	
	public static void printGraph(ArrayList<ArrayList<Integer>>adj,int vertex) {
		   for(int i=0;i<adj.size();i++) {
			   System.out.print("adjecent nodes of "+i+": ");
			   for(int j=0;j<adj.get(i).size();j++) {
				  if(j==adj.get(i).size()-1)
					   System.out.println(adj.get(i).get(j));
				   else
					   System.out.print(adj.get(i).get(j)+"-->");
					   
			   }
		   }
	   }

	static int[] topoSort(ArrayList<ArrayList<Integer>> adj, int v) {
		
		int[] vis=new int[v];
		Stack<Integer> stk= new Stack<Integer>();
		for(int i=0;i<v;i++) {
			if(vis[i]==0)
				findTopoSort(i,vis,adj,stk);
		}
		
		int[] topo=new int[v];
		for(int i=0;i<v;i++) {
			topo[i]=stk.pop();
		}
		return topo;
	}
	
	static void findTopoSort(int node, int[] vis, ArrayList<ArrayList<Integer>> adj, Stack<Integer> stk) {
		
		vis[node]=1;
		for(Integer it:adj.get(node)) {
			if(vis[it]==0)
				findTopoSort(it,vis,adj,stk);
		}
		stk.push(node);
	}

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
		int v=6;
		for(int i=0;i<v;i++) {
			adj.add(new ArrayList<Integer>());
		}
        
		addEdge(adj,5,0);
		addEdge(adj,5,2);
		addEdge(adj,4,0);
		addEdge(adj,4,1);
		addEdge(adj,2,3);
		addEdge(adj,3,1);
		
		printGraph(adj,v);
		
		System.out.println("\nafter topological sort: ");
		
		int arr[]=topoSort(adj,v);
		for(int i=0;i<v;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	

}
