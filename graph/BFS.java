package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	void bfs(ArrayList<ArrayList<Integer>> adj, int V, int s) {
		boolean visited[] = new boolean[V+1];
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
