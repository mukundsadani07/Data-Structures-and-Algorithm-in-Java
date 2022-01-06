package graph;

import java.util.*;

public class ShortestPathInAnUnweightedGraph {
	void shortestPath(ArrayList<ArrayList<Integer>> adj, int N, int src) {
		int[] dist = new int[N+1];
		for(int i=0;i<N;i++) {
			dist[i] = Integer.MAX_VALUE;
		}
		Queue<Integer> q = new LinkedList<>();
		dist[src] = 0;
		q.add(src);
		while(!q.isEmpty()) {
			int node = q.poll();
			for(int it: adj.get(node)) {
				if(dist[node]+1<dist[it]) {
					dist[it] = dist[node]+1;
					q.add(it);
				}
			}
		}
		for(int i=0;i<N;i++) {
			System.out.println(dist[i]+" ");
		}
	}
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
