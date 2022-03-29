package graph;

import java.util.*;

public class BipartiteGraphUsingDFS {
	public static void addEdge(ArrayList<ArrayList<Integer>> adj,int i,int j) {
		adj.get(i).add(j);
		adj.get(j).add(i);
	}
	boolean checkBipartite(ArrayList<ArrayList<Integer>> adj,int n) {
		int[] color = new int[n];
		Arrays.fill(color,-1);
		for(int i=0;i<n;i++) {
			if(color[i] == -1) {
				if(!dfsCheck(adj,i,color)) {
					return false;
				}
			}
		}
		return true;
	}
	boolean dfsCheck(ArrayList<ArrayList<Integer>> adj,int node,int[] color) {
		if(color[node] == -1) {
			color[node] = 1;
		}
		for(int i: adj.get(node)) {
			if(color[i]==-1) {
				color[i] = 1-color[node];
				if(!dfsCheck(adj,i,color)) {
					return false; 
				}
			}
			else if(color[i] == color[node]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 7;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			adj.add(new ArrayList<Integer>());
		}
		addEdge(adj,0,1);
		addEdge(adj,1,2);
		addEdge(adj,2,3);
		addEdge(adj,3,4);
		addEdge(adj,4,5);
		addEdge(adj,4,6);
		addEdge(adj,1,6);
		
		BipartiteGraphUsingDFS obj = new BipartiteGraphUsingDFS();
		if(obj.checkBipartite(adj, n)) {
			System.out.println("Yes, its a Bipartite Graph");
		}else {
			System.out.println("Not a Bipartite Graph");
		}
	}

}
