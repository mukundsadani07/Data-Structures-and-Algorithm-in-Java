package greedy;
import java.util.*;

class Item{
	int value;
	int weight;
}
class itemComparator implements Comparator<Item>
{
    @Override
    public int compare(Item a, Item b) 
    {
        double r1 = (double)(a.value) / (double)(a.weight); 
        double r2 = (double)(b.value) / (double)(b.weight); 
        if(r1 < r2) return 1; 
        else if(r1 > r2) return -1; 
        else return 0; 
    }
}

public class FractionalKnapsack {
	double fractionalKnapsack(int W, Item arr[], int n) {
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
//	private static double getMaxValue(int[] wt, int[] val,int capacity){
//		ItemValue[] iVal = new ItemValue[wt.length];
//
//		for (int i = 0; i < wt.length; i++) {
//			iVal[i] = new ItemValue(wt[i], val[i], i);
//		}
//       
//        // sorting items by value;
//        Arrays.sort(iVal, new Comparator<ItemValue>() {
//        @Override
//        public int compare(ItemValue o1, ItemValue o2){
//        	return o2.cost.compareTo(o1.cost);
//        }
//        });
//        
//        double totalValue = 0d;
//        
//        for (ItemValue i : iVal) {
//        
//        int curWt = (int)i.wt;
//        int curVal = (int)i.val;
//        
//        if (capacity - curWt >= 0) {
//        // this weight can be picked while
//        capacity = capacity - curWt;
//        totalValue += curVal;
//        }
//        else {
//        // item cant be picked whole
//        double fraction
//        = ((double)capacity / (double)curWt);
//        totalValue += (curVal * fraction);
//        capacity
//        = (int)(capacity - (curWt * fraction));
//        break;
//        }
//        }
//        
//        return totalValue;
//        }
//        
//        // item value class
//        static class ItemValue {
//        Double cost;
//        double wt, val, ind;
//        
//        // item value function
//        @SuppressWarnings("deprecation")
//		public ItemValue(int wt, int val, int ind)
//        {
//        this.wt = wt;
//        this.val = val;
//        this.ind = ind;
//        cost = new Double((double)val / (double)wt);
//        }
//        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] wt = { 10, 40, 20, 30 };
//        int[] val = { 60, 40, 100, 120 };
//        int capacity = 50;
// 
//        double maxValue = getMaxValue(wt, val, capacity);
// 
//        // Function call
//        System.out.println("Maximum value we can obtain = "
//                           + maxValue);
	}
}
