package greedy;
import java.util.*;

class Item{
	int value;
	int weight;
	Item(int w,int v){
		weight  = w;
		value = v;
	}
}

class itemComparator implements Comparator<Item>
{
    @Override
    public int compare(Item a, Item b) 
    {
        double r1 = (double)(a.value) / (double)(a.weight); 
        double r2 = (double)(b.value) / (double)(b.weight); 
        if(r1 < r2) 
        	return 1; 
        else if(r1 > r2) 
        	return -1; 
        else
        	return 0; 
    }
}

//class Item implements Comparable<Item>{
//	int weight;
//	int value;
//	public Item(int w,int v) {
//		weight = w;
//		value = v;
//	}
//	public int compareTo(Item i) {
//		return weight*i.value - value*i.weight;
//	}
//}
public class FractionalKnapsack {
	static double fracknapSack(int W, Item arr[], int n) {
        Arrays.sort(arr, new itemComparator()); 
        
        int curWeight = 0; 
        double finalvalue = 0.0; 
        
        for (int i = 0; i < n; i++) {
       
            if (curWeight + arr[i].weight <= W) {
                curWeight += arr[i].weight;
                finalvalue += arr[i].value;
            }
     
            else {
                int remain = W - curWeight;
                finalvalue += ((double)arr[i].value / (double)arr[i].weight) * (double)remain;
                break;
            }
        }
     
        return finalvalue;
        
    }
	
//	static double fracknapSack(Item[] arr,int w) {
//		
//		Arrays.sort(arr);
//		double res = 0.0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i].weight<=w) {
//				res +=arr[i].value;
//				w -=arr[i].weight;
//			}else {
//				res+=arr[i].value*(double)w/(double)arr[i].value;
//				break;
//			}
//		}
//		return res;
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
//		int[] wt = {10,40,20,30};
//		int[] val = {60,40,100,120};
//		int n = wt.length;
//		Item[] arr = new Item[n];
//		for(int i=0;i<n;i++) {
//			arr[i] = new Item(wt[i],val[i]);
//		}
//		int w = 50;
//		System.out.println(fracknapSack(arr,w));
		
		int[] wt = {10,40,20,30};
		int[] val = {60,40,100,120};
		int n = wt.length;
		Item[] arr = new Item[n];
		for(int i=0;i<n;i++) {
			arr[i] = new Item(wt[i],val[i]);
		}
		int w = 50;
		System.out.println((int)fracknapSack(w,arr,n));
	}
}
