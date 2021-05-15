package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//In this version, No source is given and graph may be disconnected

public class BFS2 {
	void bfs(ArrayList<ArrayList<Integer>> adj, int V, int s, boolean[] visited) {
	Queue<Integer> q = new LinkedList<Integer>();
	visited[s] = true;
	q.add(s);
	while(q.isEmpty() == false) {
		int u = q.poll();
		System.out.println(u+" ");
		for(int v: adj.get(u)) {
			if(visited[v] == false) {
				visited[v] = true;
				q.add(v);
			}
		}
		}
	}
	
	 
	void BFSDir(ArrayList<ArrayList<Integer>> adj, int V) {
//		boolean visited[V+1];
//		for(int i=0;i<V;i++) {
//			if(visited[i] == false)
//				BFS(adj,i,visited);
//		}
	}
	
	
	//Counting connected components in an undirected graph
	
//	int BFSDir(ArrayList<ArrayList<Integer>> adj, int V) {
//		int count = 0;
//		boolean visited[V+1];
//		for(int i=0;i<V;i++) {
//			if(visited[i] == false)
//				BFS(adj,i,visited);
//	        count++;
//		}
//		return count;
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
