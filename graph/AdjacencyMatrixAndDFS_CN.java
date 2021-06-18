package graph;

import java.util.Scanner;

//Coding Ninjas 
public class AdjacencyMatrixAndDFS_CN {
	//DFS
	public static void DFSHelper(int edges[][],int sv,boolean visited[]) {
		System.out.println(sv);
		visited[sv] = true;
		int n = edges.length;
		for(int i=0;i<n;i++) {
			if(edges[sv][i] == 1 && !visited[i])
				DFSHelper(edges,i,visited); 
		}
	}
	 
	public static void DFS(int edges[][]) {
		boolean visited[] = new boolean[edges.length];
		for(int i=0;i<edges.length;i++) {
			if(!visited[i]) {
			DFSHelper(edges,i,visited);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of nodes");
		int n = sc.nextInt();
		System.out.println("Enter the number of edges");
		int e = sc.nextInt();
		int[][] edges = new int[n][n];
		for(int i=0;i<e;i++) {
			int fv = sc.nextInt();
			int sv = sc.nextInt();
			edges[fv][sv] = 1;
			edges[sv][fv] = 1;
		}
		
		//printing the elements
		DFS(edges);
	}
}
