package first;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {

	public static void main(String[] args) {
		int V,e;
		Scanner sc=new Scanner(System.in);
		V=sc.nextInt();
		e=sc.nextInt();
		ArrayList<ArrayList<Integer>> adj=new ArrayList<ArrayList<Integer>>(V+1);
		for(int i=0;i<V;i++) {
			adj.add(new ArrayList<Integer>());
		}
		for(int i=0;i<e;i++) {
			int u=sc.nextInt();
			int v=sc.nextInt();
			adj.get(u).add(v);
		}
		
		int vis[]=new int[V+1];
		Queue<Integer> q=new LinkedList<>();
		int s=1;
		q.add(s);
		vis[s]=1;
		int count=1;
		
		while(q.isEmpty()==false) {
			int point=q.poll();
			for(Integer it:adj.get(point)) {
				if(vis[it]==0) {
					vis[it]=1;
					q.add(it);
					count++;
				}
			}
		}
		System.out.println("Modified vertex:"+count);
	}

}
