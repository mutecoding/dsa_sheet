package dsaTirth;

import java.util.ArrayList;

public class ThreeSumUsingPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {-4,-3,-2,-2,-1,0,1,2,2,3};
		int p=-1;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]>0) {
				break;
			}
			p = i;
		}
		ArrayList<ArrayList<Integer>> lists=threeSum(nums, p);
		for(int i=0; i<lists.size();i++) {
			System.out.print(lists.get(i));
		}
	}
	public static ArrayList<ArrayList<Integer>> threeSum(int nums[], int p) {
		ArrayList<ArrayList<Integer>> lists
        = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<p;i++) {
			int p1=p,p2=nums.length-1;
			int target = -1*nums[i];
			while(p1<p2) {
				int sum = nums[p1]+nums[p2];
				if(sum==target) {
					ArrayList<Integer> list= new ArrayList<>();
					list.add(-1*target);
					list.add(nums[p1]);
					list.add(nums[p2]);
					lists.add(list);
					p1++;
					p2--;
					
				}else if (sum>target) {
					p2--;
				}else {
					p1++;
				}
			}
			while(i<p&&nums[i]==nums[i+1]) i++;
		}
		return lists;
		
	}
}
