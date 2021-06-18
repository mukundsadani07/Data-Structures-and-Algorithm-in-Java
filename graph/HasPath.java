package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HasPath {
//	public static boolean printBFSHelper(int edges[][],int sv,boolean visited[],int x,int y) {
//		Queue<Integer> q = new LinkedList<>();
//		q.add(sv);
//		int n = edges.length;
//		visited[sv] = true;
//		while(!q.isEmpty()) {
//			int front = q.remove();
//			//or 
//			//int front;
//			//try{
//			//front = q.poll();
//			//}catch(QueueEmptyException e){
//			//return;
//			//}
//			for(int i=0;i<n;i++) {
//				if(edges[front][i] == 1 &&!visited[i]) {
//					if(edges[x][y]==1 || edges[y][x] == 1) {
//						return true;
//					}
//					q.add(i);
//					visited[i] = true;
//				}
//			}
//		}
//	}
//	public static boolean BFS(int edges[][],int x,int y) {
//		boolean visited[] = new boolean[edges.length];
//		int n = edges.length;
//		for(int i=0;i<n;i++) {
//			if(!visited[i])
//				printBFSHelper(edges,i,visited);
//		}
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number of nodes");
//		int n = sc.nextInt();
//		System.out.println("Enter the number of edges");
//		int e = sc.nextInt();
//		int[][] edges = new int[n][n];
//		for(int i=0;i<e;i++) {
//			int fv = sc.nextInt();
//			int sv = sc.nextInt();
//			edges[fv][sv] = 1;
//			edges[sv][fv] = 1;
//		}
//		System.out.println("Vertex 1: ");
//		int x = sc.nextInt();
//		System.out.println("Vertex 2: ");
//		int y = sc.nextInt();
//		BFS(edges);
//	}
}
