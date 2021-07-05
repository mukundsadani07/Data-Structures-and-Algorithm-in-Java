package graph;

import java.util.ArrayList;
import java.util.Scanner;

public class AdjacencyListRepresentation {
	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
		//as it is an undirected graph
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	static void printGraph(ArrayList<ArrayList<Integer> > adj)
    {
        for (int i = 0; i < adj.size(); i++) {
            System.out.println("\nAdjacency list of vertex " + i);
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(" -> "+adj.get(i).get(j));
            }
            System.out.println();
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number of vertices");
		int V = 5;
//		int V = sc.nextInt();
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(V);
		for(int i=0;i<V;i++)
			adj.add(new ArrayList<Integer>());
		// Adding edges one by one
//		System.out.println("Enter the number of edges");
//		int e = sc.nextInt();
//		System.out.println("Enter the elements");
//		for(int i=0;i<e;i++) {
//			int v = sc.nextInt();
//			int u = sc.nextInt();
//			
//		}
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 4);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);
		
		printGraph(adj);
	}
}
