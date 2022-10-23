package DepthFirstSearch;

import java.util.ArrayList;
import java.util.Scanner;

public class DFS {
	
	public static void addEdge(ArrayList<ArrayList<Integer>>adj,int u,int v) {
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
    public static void dfs(ArrayList<ArrayList<Integer>> adj,int v,int source) {
    	boolean visited[]=new boolean[v];
    	System.out.println("vextex after traversing using dfs:");
    	DFSrec(adj,source,visited);
    	
  }
    
    public static void DFSrec(ArrayList<ArrayList<Integer>> adj,int s,boolean[] visited) {
    	visited[s]=true;
    	System.out.print(s+" ");
    	for(int u:adj.get(s)) {
    		if(visited[u]==false)
    			DFSrec(adj,u,visited);
    	}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub+
    ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>> ();
    
    int vertex=5;
    for(int i=0;i<vertex;i++) {
    	adj.add(new ArrayList<Integer>());
    }
    int u,v;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter nodes(u) and ajcecent(v):");
    for(int i=0;i<vertex;i++) {
    	u=sc.nextInt();
    	v=sc.nextInt();
    	addEdge(adj,u,v);
    }
    int source=0;
    printGraph(adj,vertex);
    dfs(adj,vertex,source);
    sc.close();
    
	}

}
