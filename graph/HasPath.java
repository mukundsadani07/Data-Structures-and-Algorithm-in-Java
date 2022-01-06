package graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class HasPath {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static boolean BFS(int edges[][],int sv,int ev, boolean[] visited) {
		//Check for invalid input of sv or fv
		if(sv>(edges.length-1) || ev>(edges.length-1))
			return false;
		
		if(edges[sv][ev] == 1)
			return true;
		
		Queue<Integer> q = new LinkedList<>();
		visited[sv] = true;
		q.add(sv);
		while(!q.isEmpty()) {
			int front = q.remove();
			for(int i=0;i<edges.length;i++) {
				if(edges[front][i] == 1 && !visited[i]) {
					if(i==ev)
						return true;
					else {
						visited[i] = true;
						q.add(i);
					}
				}
			}
		}
		return false;
	}
	
	@SuppressWarnings("unused")
	private static boolean hasPath(int[][] edges,int sv,int ev) {
		boolean visited[] = new boolean[edges.length];
		return BFS(edges,sv,ev,visited);
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		String[] strNums;
		strNums = br.readLine().split("\\s");
		int n = Integer.parseInt(strNums[0]);
		int e = Integer.parseInt(strNums[1]);
		
		int edges[][] = new int[n][n];
		
		for(int i=0;i<e;i++) {
			String[] strNums1;
			strNums1 = br.readLine().split("\\s");
			int sv = Integer.parseInt(strNums1[0]);
			int ev = Integer.parseInt(strNums1[1]);
			
			System.out.println(hasPath(edges,sv,ev));
		}
	}
}
