package BreadthFirstSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
	
	static void addEdge(ArrayList<ArrayList<Integer>> adj,int u,int v) {
		adj.get(u).add(v);
	}
	
	/*public static void printGraph(ArrayList<ArrayList<Integer>> adj) {
		int max=0;
		for(int i=0; i<adj.size();i++) {
			System.out.print("Adjecency list of node "+i+": ");
			int count=0;
			for(int j=0;j<adj.get(i).size();j++) {
				count++;
				if(j==adj.get(i).size()-1)
					System.out.println(adj.get(i).get(j));
				else
			     System.out.print(adj.get(i).get(j)+",");
			}
			if(count>max)
				max=count;
		}
		System.out.println("Maximum depth of graph: "+max);
	}*/
	
	static void BreadthFirstSearch(ArrayList<ArrayList<Integer>> adj,int v,int s) {
		boolean visited[]=new boolean[v+1];
		Queue<Integer> q= new LinkedList<Integer>();
		
		visited[s]=true;
		q.add(s);
		int modified=0;
		System.out.println("after traversing with BFS:");
		while(q.isEmpty()==false) {
			int u=q.poll();
			System.out.print(u+" ");
			for(int i:adj.get(u)) {
				if(visited[i]==false) {
					visited[i]=true;
					q.add(i);
					modified++;
				}
			}
			
		}
		System.out.println("modified vertices:"+modified);
		
	}

	public static void main(String[] args) {
		int vertex=6;
		int edge=5;
    ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(vertex);
    for(int i=0;i<vertex;i++) {
    	adj.add(new ArrayList<Integer>());
    }
    Scanner sc=new Scanner(System.in);
    
    for(int i=0;i<edge;i++) {
    	int u=sc.nextInt();
    	int v=sc.nextInt();
    	adj.get(u).add(v);
    	//adj.get(v).add(u);
    }
    /*addEdge(adj,0,1);
    addEdge(adj,0,2);
    addEdge(adj,1,3);
    addEdge(adj,2,3);
    addEdge(adj,2,4);
    addEdge(adj,3,4);*/
    
    int s=1;
    //printGraph(adj);
    BreadthFirstSearch(adj,vertex,s);
    sc.close();
	}

}
