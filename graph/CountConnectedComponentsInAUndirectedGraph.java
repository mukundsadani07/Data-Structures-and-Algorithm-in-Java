package graph;

import java.util.ArrayList;

public class CountConnectedComponentsInAUndirectedGraph {
	void dfsRec(ArrayList<ArrayList<Integer>> adj,int s,boolean[] visited){
		visited[s] = true;
		for(int u: adj.get(s)) {
			if(visited[u]==false) {
				dfsRec(adj,u,visited);
			}
		}
	}
//	void dfs(ArrayList<ArrayList<Integer>> adj,int v,int s) {
//		boolean visited[] = new boolean[v];
//		dfsRec(adj,s,visited); 
//	}
	
	//For disconnected graphs
	int dfs(ArrayList<ArrayList<Integer>> adj,int v,int s) {
	boolean visited[] = new boolean[v];
	int count = 0;
	for(int i=0;i<v;i++) {
		if(visited[i] == false) {
			dfsRec(adj,i,visited);
			count++;
		}
	}
	return count; 
}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
