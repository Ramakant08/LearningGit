package adjecencyMatrix;

import java.util.ArrayList;
import java.util.Scanner;

public class AdjecencyMatrixUsingScanner {
  
	public static void main(String[] args) {
		int vertex=5;
		int start,end,cost;
		int [][] matrix=new int[vertex+1][vertex+1];
		ArrayList<adjecencyMatrixGraph> edgeList=new ArrayList<adjecencyMatrixGraph>();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter graph in matrix:");
		for(int i=0;i<vertex;i++) {
			start=sc.nextInt();
			end=sc.nextInt();
			cost=sc.nextInt();
			edgeList.add(new adjecencyMatrixGraph(start,end,cost));
		}
		
		for(int i=0;i<edgeList.size();i++){
			
			 adjecencyMatrixGraph currentEdge=edgeList.get(i);
			 int startVertex = currentEdge.startVertex;
			 int endVertex=currentEdge.endVertex;
			 int weight=currentEdge.weight;
			 matrix[startVertex][endVertex]=weight;
		}
       for(int i=1;i<=vertex;i++) {
			for(int j=1;j<=vertex;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
       sc.close();
       }

}
