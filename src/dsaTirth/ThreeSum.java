package dsaTirth;

import java.util.*;

public class ThreeSum {

	public static void main(String[] args) {
		int nums[] = {-4,-3,5,7,-2,-2,-1,0,1,2,2,3};
		Arrays.sort(nums);
		ArrayList<ArrayList<Integer>> lists
        = new ArrayList<ArrayList<Integer>>();
		System.out.println(Arrays.toString(nums));
//		threeSumTwoPointer(nums,lists);
		threeSumCompliment(nums,lists);
		
	}
	public static void threeSumCompliment(int []nums,ArrayList<ArrayList<Integer>> lists) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<nums.length-2;i++) {
			map.put(nums[i], i);
		}

		for(int i=0; i<nums.length;i++) {
			int target = -1*nums[i];
			int p=i+1;
			while(p<nums.length) {
				if(map.containsKey(target-nums[p])&& map.get(target-nums[p])!=i && map.get(target-nums[p])!=p) {
					ArrayList<Integer> list
			        = new ArrayList<>();
					list.add(nums[i]);
					list.add(nums[p]);
					list.add(target-nums[p]);
					lists.add(list);
					p++;
					while(p<nums.length&&nums[p]==nums[p-1]) p++;
					System.out.println(list);
				}else {
					p++;
				}
			}
			while(i<nums.length-1&&nums[i]==nums[i+1]) i++;
		}
	}
	public static void threeSumTwoPointer(int []nums,ArrayList<ArrayList<Integer>> lists) {
		for(int i=0; i<nums.length;i++) {
			int target = -1*nums[i];
			int p1 = i+1;
			int p2 = nums.length-1;
			while(p1<p2) {
				int sum = nums[p1]+nums[p2];
				if(sum==target) {
					ArrayList<Integer> list
			        = new ArrayList<>();
					list.add(nums[i]);
					list.add(nums[p1]);
					list.add(nums[p2]);
					lists.add(list);
					System.out.println(list);
					p1++;
					p2--;
					while(p1<p2&&nums[p1]==nums[p1-1]) p1++;
					while(p1<p2&&nums[p2]==nums[p2+1]) p2--;
				}else if(sum>target) {
					p2--;
				}else {
					p1++;
				}
			}
			while(i<nums.length-1&&nums[i]==nums[i+1]) i++;
		}
		System.out.println(lists);
	}

}
