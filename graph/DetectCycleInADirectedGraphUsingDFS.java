package graph;
import java.util.*;

public class DetectCycleInADirectedGraphUsingDFS {
	boolean DFSRec(ArrayList<ArrayList<Integer>> adj,int s,boolean[] visited, boolean[] recSt) {
		visited[s] = true;
		recSt[s] = true;
		for(int u: adj.get(s)) {
			if(visited[u] == false && DFSRec(adj,u,visited,recSt))
				return true;
			else if(recSt[u] == true) // if its visited and also its recursion stack is also visited that means theres a cycle
				return true;
		}
		recSt[s] = false; //backtrack and make recursion stack false after the recursion calls get over
		return false;
	}
	
	//For disconnected graph
	boolean DFS(ArrayList<ArrayList<Integer>> adj, int V) {
		boolean visited[] = new boolean[V];
		boolean recSt[] = new boolean[V];
		for(int i=0;i<V;i++) {
			if(visited[i] == false)
				if(DFSRec(adj,i,visited,recSt) == true)
					return true;
		} 
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
