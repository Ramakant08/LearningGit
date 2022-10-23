package CycleDetection;

import java.util.ArrayList;
import java.util.Arrays;

public class DirectedGraphDFS {
    static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v) {
    	adj.get(u).add(v);
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
    static boolean cycleDetect(int node, ArrayList<ArrayList<Integer>> adj, int[] vis, int[] dfsvis) {
		
        vis[node]=1;
        dfsvis[node]=1;
        for(Integer it:adj.get(node)) {
        	if(vis[it]==0 && cycleDetect(it,adj,vis,dfsvis))
        			return true;
        	else if(dfsvis[it]==1)
        		return true;
        	
        	
        }
        dfsvis[node]=0;
    	return false;
    	
    }
    static boolean isCycle(ArrayList<ArrayList<Integer>> adj,int vertex) {
		
    	int[] vis=new int[vertex+1];
    	Arrays.fill(vis, 0);
    	int[] dfsvis=new int[vertex+1];
    	Arrays.fill(dfsvis, 0);
    	for(int i=0;i<vertex;i++) {
    		if(vis[i]==0)
    			if(cycleDetect(i,adj,vis,dfsvis)==true)
    				return true;
    	}
    	return false;
    	
    }
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>();
		int vertex=10;
		for(int i=0;i<vertex;i++) {
			adj.add(new ArrayList<Integer>());
		}
		

		addEdge(adj,1,2);
		addEdge(adj,2,3);
		addEdge(adj,3,4);
		addEdge(adj,4,5);
		addEdge(adj,6,3);
		addEdge(adj,6,5);
		addEdge(adj,7,2);
		addEdge(adj,7,8);
		addEdge(adj,8,9);
		addEdge(adj,7,9);
	
	printGraph(adj,vertex);
	boolean res=isCycle(adj,vertex);
	System.out.println("\ngraph contains cycle is:"+res);
	
       
	}

}
