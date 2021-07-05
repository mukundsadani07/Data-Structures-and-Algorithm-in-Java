package graph;

import java.util.ArrayList;
import java.util.Scanner;

public class ShortestPathInAnUnweightedGraph {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
		System.out.println("Enter the number of vertices");
		int V = sc.nextInt();
		System.out.println("Enter the number of edges");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			adj.get(u).add(v);
			adj.get(u).add(v);
		}
	}
}
