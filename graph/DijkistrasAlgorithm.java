package graph;

import java.util.*;

public class DijkistrasAlgorithm {
	private static void dijkistras(int[][] adjacencyMatrix) {
		int v = adjacencyMatrix.length;
		boolean[] visited = new boolean[v];
		int[] distance = new int[v];
		distance[0] = 0;
		for(int i =1;i<v;i++) {
			distance[i] = Integer.MAX_VALUE; 
		}
		for(int i=0;i<v-1;i++) {
			//Find vertex with minimum distance
			int minVertex = findMinVertex(distance, visited);
			visited[minVertex] = true;
			//Explore Neighbors
			for(int j=0;j<v;j++) {
				if(adjacencyMatrix[minVertex][j]!=0 && !visited[j] && distance[minVertex]!=Integer.MAX_VALUE) {
					int newDist = distance[minVertex] + adjacencyMatrix[minVertex][j]; 
					if(newDist<distance[j]) {
						distance[j] = newDist;
					}
					//or distance[j] = Math.min(newDist,distance[j]);
				}
			}
		}
		//print
		for(int i=0;i<v;i++) {
			System.out.println(i+" "+ distance[i]);
		}
	}
	private static int findMinVertex(int[] distance, boolean[] visited) {
		// TODO Auto-generated method stub
		int minVertex = -1;
		for(int i=0;i<distance.length;i++) {
			if(!visited[i] && (minVertex == -1 || distance[i]<distance[minVertex]))
				minVertex = i;
		}
		return minVertex;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of vertices");
		int v = sc.nextInt();
		System.out.println("Enter the number of edges");
		int e = sc.nextInt();
		int adjacencyMatrix[][] = new int[v][v];
		for(int i=0;i<e;i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			int weight = sc.nextInt();
			adjacencyMatrix[v1][v2] = weight;
			adjacencyMatrix[v2][v1] = weight;
		}
		dijkistras(adjacencyMatrix);
//		 BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
//		 String str[] = read.readLine().trim().split(" ");
//		 int V = Integer.parseInt(str[0]);
//		 int E = Integer.parseInt(str[1]);
//		    
//		 ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<ArrayList<ArrayList<Integer>>>();
//		 for(int i=0;i<V;i++){
//		    adj.add(new ArrayList<ArrayList<Integer>>());
//		}
//		
//		int i=0;
//		while (i++<E) {
//		    String S[] = read.readLine().trim().split(" ");
//		    int u = Integer.parseInt(S[0]);
//		    int v = Integer.parseInt(S[1]);
//		    int w = Integer.parseInt(S[2]);
//		    ArrayList<Integer> t1 = new ArrayList<Integer>();
//		    ArrayList<Integer> t2 = new ArrayList<Integer>();
//		    t1.add(v);
//		    t1.add(w);
//		    t2.add(u);
//		    t2.add(w);
//		    adj.get(u).add(t1);
//		    adj.get(v).add(t2);
//		}
//		
//		int S = Integer.parseInt(read.readLine());
//		int[] ptr = dijkistras(adj);
//		
//		for(i=0; i<V; i++)
//		    System.out.print(ptr[i] + " ");
//		System.out.println();
	}
}
