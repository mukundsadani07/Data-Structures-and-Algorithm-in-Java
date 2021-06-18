package graph;
import java.util.*;

public class TopologicalSortingUsingKahnsAlgorithm {
	static void topological(ArrayList<ArrayList<Integer>> adj,int v) {
		int[] indegree = new int[v];
		for(int i=0;i<v;i++) {
			for(int j:adj.get(i)) {
				indegree[j]++;
			}
		}
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i=0;i<v;i++) {
			if(indegree[i] == 0) {
				q.add(i);
			}
		}
		while(!q.isEmpty()) {
			int u = q.poll();
			System.out.print(u+" ");
			for(int x: adj.get(u)) {
				if(--indegree[x] == 0)
					q.add(x);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}
