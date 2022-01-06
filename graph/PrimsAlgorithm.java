package graph;

import java.util.Scanner;

public class PrimsAlgorithm {
	static void prims(int[][] adjacencyMatrix) {
		int v = adjacencyMatrix.length;
		boolean visited[] = new boolean[v];
		int weight[] = new int[v];
		int parent[] = new int[v];
		parent[0] = -1;
		weight[0] = 0;
		for(int i=1;i<v;i++) {
			weight[i] = Integer.MAX_VALUE;
		}
		for(int i=0;i<v;i++){
			//Pick vertex with minimum weight
			int minVertex = findMinVertex(weight,visited);
			visited[minVertex] = true;
			//Explore its unvisited neighbors
			for(int j=0;j<v;j++) {
				if(adjacencyMatrix[minVertex][j]!=0 && !visited[j] ) {
					if(adjacencyMatrix[minVertex][j]<weight[j]) {
						weight[j] = adjacencyMatrix[minVertex][j];
						parent[j] = minVertex;
					}
				}
			}
		}
		//print edges of mst
		for(int i=1;i<v;i++) {
			if(parent[i]<i) {
				System.out.println(parent[i]+" "+i+" "+weight[i]);
			}else {
				System.out.println(i+" "+parent[i]+" "+weight[i]);
			}
		} 
	}
//	private static int findMinVertex(int[] weight, boolean[] visited) {
//		// TODO Auto-generated method stub
//		int minVertex = -1;
//		for(int i=0;i<weight.length;i++) {
//			if(!visited[i] && (minVertex == -1 || weight[minVertex]>weight[i])) {
//				minVertex = i;
//			}
//		}
//		return minVertex;
//	}
	
	private static int findMinVertex(int[] weight,boolean[] visited) {
		int minVertex = -1,min = Integer.MAX_VALUE;
		for(int i=0;i<weight.length;i++) {
			if(!visited[i]&& min>weight[i]) {
				min = weight[i];
				minVertex = i;
  			}
		}
		return minVertex;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of vertices");
		int v = sc.nextInt();
		System.out.println("Enter the number of edges");
		int e = sc.nextInt();
		int adjacencyMatrix[][] = new int[v][v];
		for(int i=0;i<e;i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			int weight = sc.nextInt();
			adjacencyMatrix[v1][v2] = weight;
			adjacencyMatrix[v2][v1] = weight;
		}
		prims(adjacencyMatrix);
	}
}
