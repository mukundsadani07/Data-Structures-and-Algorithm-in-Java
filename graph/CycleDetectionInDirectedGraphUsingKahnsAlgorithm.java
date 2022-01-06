package graph;
import java.util.*;

public class CycleDetectionInDirectedGraphUsingKahnsAlgorithm {
	 public static boolean isCyclicKahn(int V, ArrayList<ArrayList<Integer>> adj){
		 //For storing the indegree of the vertices, initially all are 0
	        int[] indegree = new int[V];
			for(int i=0;i<V;i++) {
				for(int x:adj.get(i)){
					indegree[x]++;
				}
			}
			Queue<Integer> q = new LinkedList<Integer>();
			for(int i=0;i<V;i++) {
				if(indegree[i] == 0) {
					q.add(i);
				}
			}
			int count = 0;
			while(!q.isEmpty()) {
				int u = q.poll();
				count++;
				for(int x:adj.get(u)) {
					if(--indegree[x] == 0) {
						q.add(x);
					}
				}
//				count++;
			}
			return (count!=V);
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		System.out.println("Enter the number of vertices");
		int V = sc.nextInt(); 
		System.out.println("Enter the number of edges");
		int E = sc.nextInt();
		for(int i=0;i<E;i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			list.get(u).add(v);
		}
		boolean p = isCyclicKahn(V,list);
		System.out.println(p);
	}
}
