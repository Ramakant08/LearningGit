package adjecencyList;

import java.util.ArrayList;
import java.util.Scanner;

public class AdjecencyListUsingScanner {
 
	public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u,int v) {  
		adj.get(u).add(v);
		
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
		
		Scanner sc=new Scanner(System.in);
		
		//vertex=sc.nextInt();
		for(int i=0;i<5;i++) {
			adj.add(new ArrayList<Integer>());
		}
	//to enter nodes and edges in graph
		System.out.println("enter no. of connections:");
		int connect=sc.nextInt();
		System.out.println("enter adjecent nodes:");
		
		while(connect>0) {
			
			int u=sc.nextInt();
			int v=sc.nextInt();
			addEdge(adj,u,v);
		    connect--;
		}
		
	//to print graph and find max depth
		printGraph(adj);
		sc.close();
	}

}
