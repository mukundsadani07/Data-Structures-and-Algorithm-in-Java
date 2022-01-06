package graph;

import java.util.Arrays;
import java.util.Scanner;

//Here we have created a userdefined data type "Edge"
//We are using a comparable interface to sort according to the weights
class Edge implements Comparable<Edge>{
	int source;
	int dest;
	int weight;
	public int compareTo(Edge o) {
		return this.weight - o.weight;
	}
}
public class KruskalsAlgorithm {
	//findParent is made to avoid any cycles in the mst
	//here we are using union find algorithm for cycle detection
	public static int findParent(int v,int parent[]) {
		//we stop when index and the value is same
		if(parent[v] == v) {
			return v;
		}
		return findParent(parent[v],parent);
	}
	public static void kruskals(Edge[] input,int n) {
		Arrays.sort(input);
		
		Edge[] output = new Edge[n-1];
		
		int[] parent = new int[n];
		for(int i=0;i<n;i++) {
			parent[i] = i;
		}
		
		int count = 0;
		int i = 0;
		//As for MST no of edges should be n-1 hence the while loop
		while(count!=n-1) {
			Edge currentEdge = input[i];
			 
			int sourceParent = findParent(currentEdge.source, parent);
			int destParent = findParent(currentEdge.dest, parent);
			
			if(sourceParent != destParent) {
				output[count++] = currentEdge;
//				count++;
				//making any one of the sourceParent and destParent as child and parent
				parent[sourceParent] = destParent;
			}
			i++;
		}
		//printing the final MST
		for(int j=0;j<n-1;j++) {
			if(output[j].source<output[j].dest) {
				System.out.println(output[j].source+" "+output[j].dest+" "+output[j].weight);
			}else {
				System.out.println(output[j].dest+" "+output[j].source+" "+output[j].weight);
			}
		 
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int e = sc.nextInt();
		
		Edge[] input = new Edge[e];
		for(int i=0;i<e;i++) {
			input[i] = new Edge();
			input[i].source = sc.nextInt();
			input[i].dest = sc.nextInt();
			input[i].weight = sc.nextInt();
		}
		kruskals(input,n);
	}
}
