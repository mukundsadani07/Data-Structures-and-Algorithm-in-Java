package graph;
import java.util.*;


public class DetectCycleInAnUndirectedGraph {
	//DFS based Solution
	static boolean DFSRec(ArrayList<ArrayList<Integer>> adj, int s, boolean[] visited, int parent) {
		visited[s] = true;
		for (int u: adj.get(s)){
			if(visited[u] == false) 
					if(DFSRec(adj,u,visited,s) == true) 
						return true;
					else if(u!=parent)
						return true;
				}return false;
			}  

	 //To handle the disconnected graph    
	static boolean DFS(ArrayList<ArrayList<Integer>> adj, int V) {
			boolean visited[] = new boolean[V];
			for(int i=0;i<V;i++)
				if(visited[i] == false)
					// 
					if(DFSRec(adj,i,visited,-1) == true)
						return true;
			return false;
		}
	    // Driver code
	    public static void main(String[] args){
	    	
	    }
	}
