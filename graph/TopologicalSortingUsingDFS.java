package graph;
import java.util.*;

public class TopologicalSortingUsingDFS {
	
	static int[] topological(ArrayList<ArrayList<Integer>> adj, int v) {
		Stack<Integer> s = new Stack<Integer>();
		boolean[] visited = new boolean[v];
		for(int i=0;i<v;i++) {
			if(!visited[i]) {
				dfs(i,adj,visited,s);
			}
		}
		int[] arr = new int[v];
		int i=0;
		while(!s.isEmpty()) {
			arr[i] = s.pop();
			i++;
		}
		return arr;
	}
	
	static void dfs(int i, ArrayList<ArrayList<Integer>> adj,boolean[] visited,Stack<Integer> s) {
		// TODO Auto-generated method stub
		visited[i] = true;
		for(int x:adj.get(i)) {
			if(!visited[x])
				dfs(x,adj,visited,s);
		}
		s.push(i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
