
package  TopologicalSort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopologicalSortBFS {
	
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
	
	 static void addEdge(ArrayList<ArrayList<Integer>> adj, int i, int j) {
			adj.get(i).add(j);
			
		}

	 static int[] topoSort(ArrayList<ArrayList<Integer>> adj,int v) {
		
		 int[] topo=new int[v];
		 int[] indegree=new int[v];
		 
		 for(int i=0;i<v;i++) {
			 for(Integer u:adj.get(i)) {
				 indegree[u]++;
			 }
		 }
		 
		 Queue<Integer> q=new LinkedList<Integer>();
		 for(int i=0;i<v;i++) {
			 if(indegree[i]==0)
				 q.add(i);
		 }
		 int index=0;
		 
		 while(q.isEmpty()==false) {
			 Integer node=q.poll();
			 topo[index++]=node;
			 for(Integer it:adj.get(node)) {
				 indegree[it]--;
				 if(indegree[it]==0) {
					 q.add(it);
				 }
			 }
		 }
		 
		 return topo;
		 
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
		
		System.out.println("after topological sort: ");
		int arr[]=topoSort(adj,v);
		for(int i=0;i<v;i++) {
			System.out.print(arr[i]+" ");
		}

	}

	

	
}
