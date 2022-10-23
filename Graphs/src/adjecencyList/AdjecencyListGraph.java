package adjecencyList;

import java.util.ArrayList;
//import java.util.Scanner;

public class AdjecencyListGraph {
	
	public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u,int v) {  
		adj.get(u).add(v);
		adj.get(v).add(u);
	}

	public static void printGraph(ArrayList<ArrayList<Integer>> adj) {
		int max=0;
		for(int i=0; i<adj.size()-1;i++) {
			System.out.print("Adjecency list of node "+i+": ");
			int count=0;
			for(int j=0;j<adj.get(i).size();j++) {
				count++;
				if(j==adj.get(i).size()-1)
					System.out.println(adj.get(i).get(j));
				else
			     System.out.print(adj.get(i).get(j)+"--> ");
			}
			if(count>max)
				max=count;
		}
		System.out.println("Maximum depth of graph: "+max);
	}
	public static void main(String[] args) {
		ArrayList<ArrayList <Integer>> adj = new ArrayList<ArrayList<Integer>>();
		
		//Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		for(int i=0;i<5;i++) {
			adj.add(new ArrayList<Integer>());
		}
	//to enter nodes and edges in graph	
		addEdge(adj,0,1);
		addEdge(adj,0,2);
		addEdge(adj,1,2);
		//addEdge(adj,1,3);
		
	//to print graph and find max depth
		printGraph(adj);
		
	}

}
