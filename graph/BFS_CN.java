package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_CN {
	public static void printBFSHelper(int edges[][],int sv,boolean visited[]) {
		Queue<Integer> q = new LinkedList<>();
		q.add(sv);
		visited[sv] = true;
		int n = edges.length;
		while(!q.isEmpty()) {
			int front = q.remove();
			//or 
			//int front;
			//try{
			//front = q.poll();
			//}catch(QueueEmptyException e){
			//return;
			//}
			System.out.println(front);
			for(int i=0;i<n;i++) {
				if(edges[front][i] == 1 &&!visited[i]) {
					q.add(i);
					visited[i] = true;
				}
			}
		}
	}
	public static void BFS(int edges[][]) {
		boolean visited[] = new boolean[edges.length];
		int n = edges.length;
		for(int i=0;i<n;i++) {
			if(!visited[i])
				printBFSHelper(edges,i,visited);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of nodes");
		int n = sc.nextInt();
		System.out.println("Enter the number of edges");
		int e = sc.nextInt();
		int[][] edges = new int[n][n];
		for(int i=0;i<e;i++) {
			int fv = sc.nextInt();
			int sv = sc.nextInt();
			edges[fv][sv] = 1;
			edges[sv][fv] = 1;
		}
		
		//printing the elements
		BFS(edges);
	}
}
