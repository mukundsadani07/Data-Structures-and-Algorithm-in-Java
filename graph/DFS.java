package graph;

import java.util.*;
public class DFS {
	void dfsRec(ArrayList<ArrayList<Integer>> adj,int s,boolean[] visited){
		visited[s] = true;
		System.out.println(s+" ");
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
	void dfs(ArrayList<ArrayList<Integer>> adj,int v,int s) {
	boolean visited[] = new boolean[v];
	for(int i=0;i<v;i++) {
		if(visited[i] == false) {
			dfsRec(adj,i,visited);
		}
	}
}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
