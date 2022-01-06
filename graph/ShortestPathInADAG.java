package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ShortestPathInADAG {
	static void shortestPath(ArrayList<ArrayList<Integer>> adj,int v,int src) {
		int[] distance = new int[v];
		Arrays.fill(distance, Integer.MAX_VALUE);
		distance[src] = 0;
		int[] indegree = new int[v];
		for(int i=0;i<v;i++) {
			for(int x:adj.get(i)) {
				indegree[x]++;
			}
		}
		Queue<Integer> q = new LinkedList<>();
		for(int i=0;i<v;i++) {
			if(indegree[i] == 0) {
				q.add(i);
			}
		}
		int topological[] = new int[v];
		int i=0;
		while(q.isEmpty()) {
			int u = q.poll();
			topological[i++] = u;
			for(int x:adj.get(u)) {
				if(--indegree[x] == 0) {
					q.add(x);
				}
			}
		}
		for(int j=0;j<v;j++) {
			for(int x:adj.get(topological[j])) {
				if(distance[x]>distance[topological[j]]+adj.get(topological[x]).get(0)){
					distance[x] = distance[topological[j]]+adj.get(topological[x]).get(0);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of vertices");
		int v = sc.nextInt();
		System.out.println("Enter the number of edges");
		int e = sc.nextInt();
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<e;i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
//			int weight = sc.nextInt();
//			adj.get(v1) = weight;
		}
		shortestPath(adj,v,0);
	}
}
