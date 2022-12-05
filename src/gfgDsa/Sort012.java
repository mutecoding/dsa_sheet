package gfgDsa;

import java.util.Arrays;

public class Sort012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {0,1,0,2,0,1,1,0};
//		int n = nums.length-1;
		for(int i=0; i<nums.length-1; i++) {
			if(nums[i]>nums[i+1]) {
				int p= i+1;
				while(p>0&&nums[p-1]>nums[p]) {
					nums[p-1]=nums[p-1]+nums[p];
					nums[p]=nums[p-1]-nums[p];
					nums[p-1]=nums[p-1]-nums[p];
					p--;
				}
			}
		}
		System.out.print(Arrays.toString(nums));

	}

}
