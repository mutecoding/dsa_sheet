package dsaTirth;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {5,4,3,2,1,0};
		int target = 2;
		for(int i=0;i<nums.length;i++) {
			int j=i;
			int temp=nums[j];
			while(j>0&&nums[j]<nums[j-1]) {
				nums[j] = nums[j-1];
				j--;
			}
			nums[j]=temp;
		}
		System.out.println(Arrays.toString(nums));
		System.out.println(linearSearch(nums,target));
	}
	public static int linearSearch(int []nums,int target) {
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==target) {
				return i;			
			}
		}
		return-1;
	}

}
