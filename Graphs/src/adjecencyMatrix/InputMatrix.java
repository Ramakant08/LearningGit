package adjecencyMatrix;
import java.util.ArrayList;
public class InputMatrix {

	public static void main(String[] args) {
		int vertex=5;
		int [][] matrix=new int[vertex+1][vertex+1];
		ArrayList<adjecencyMatrixGraph> edgeList=new ArrayList<adjecencyMatrixGraph>();
		
		edgeList.add(new adjecencyMatrixGraph(1,4,2));
		edgeList.add(new adjecencyMatrixGraph(4,2,15));
		edgeList.add(new adjecencyMatrixGraph(2,4,8));
		edgeList.add(new adjecencyMatrixGraph(3,4,6));
		edgeList.add(new adjecencyMatrixGraph(3,1,10));
		edgeList.add(new adjecencyMatrixGraph(3,4,5));
		
		
		for(int i=0;i<edgeList.size();i++) {
			 adjecencyMatrixGraph currentEdge=edgeList.get(i);
			 int startVertex = currentEdge.startVertex;
			 int endVertex=currentEdge.endVertex;
			 int weight=currentEdge.weight;
			 matrix[startVertex][endVertex]=weight;
		}
       for(int i=0;i<vertex;i++) {
			for(int j=0;j<vertex;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
