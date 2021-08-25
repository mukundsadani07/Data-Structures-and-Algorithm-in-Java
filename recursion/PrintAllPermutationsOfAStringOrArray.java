package recursion;
import java.util.*;

public class PrintAllPermutationsOfAStringOrArray {
	static void recurPermute(int[] nums, List<Integer> ds, List<List<Integer>> ans, boolean[] freq) {
		if(ds.size() == nums.length) {
			ans.add(new ArrayList<>(ds));
			return;
		}
		for(int i=0;i<nums.length;i++) {
			if(!freq[i]) {
				freq[i] = true;
				ds.add(nums[i]);
				recurPermute(nums,ds,ans,freq);
				ds.remove(ds.size()-1);
				freq[i] = false;
			}
		}
	}
	static List<List<Integer>> permute(int[] nums){
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> ds = new ArrayList<>();
		boolean[] freq = new boolean[nums.length];
		recurPermute(nums,ds,ans,freq);
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		List<List<Integer>> a = permute(nums);
		for(int i=0;i<a.size();i++) {
			for(int j=0;j<a.get(i).size();j++) {
				System.out.print(a.get(i).get(j));
			}
			System.out.println();
		}
	}
}
