package graph;
import java.util.*;	

//sorting according to the weights
class Pair implements Comparable<Pair>{
    int vertex;
    int acquiringVertex;
    int weight;
    Pair(int vertex,int acquiringVertex,int weight){
        this.vertex = vertex;
        this.acquiringVertex = acquiringVertex;
        this.weight = weight;
    }
    public int compareTo(Pair o){
        return this.weight - o.weight;
    }
}
public class PrimsAlgorithm2 {
	static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) {
    int result = 0;
    PriorityQueue<Pair> pq = new PriorityQueue<>();
    pq.add(new Pair(0,-1,0)); //vertex,parent,weight
    boolean[] visited = new boolean[V];
    while(pq.size()>0){
        Pair removed = pq.remove();
        if(visited[removed.vertex]){
            continue;
        }
        visited[removed.vertex] = true;
        result += removed.weight;
        for(ArrayList<Integer> e: adj.get(removed.vertex)){
            if(!visited[e.get(0)]){
                pq.add(new Pair(e.get(0),removed.vertex,e.get(1)));
            }
        }
    }
    return result;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}
