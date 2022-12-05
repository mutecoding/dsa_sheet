package dsaPractice;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {1,5,4,3,2,9,7,6,8};
		mergeSort(nums,0,nums.length-1);
		System.out.print(Arrays.toString(nums));
	}
	public static int[] mergeSort(int []nums,int l, int r) {
		if(l==r) return nums;
		int mid = l+ (r-l)/2;
		mergeSort(nums,l,mid);
		mergeSort(nums,mid+1,r);
		return merge(nums,l,r,mid);
		
	}
	public static int[] merge(int []nums, int l, int r, int mid) {
		int p=mid+1;
		while(l<=mid) {
			if(nums[l]>nums[p]){
				swap(nums,l,p);
				insertRight(nums, p,r);
			}
			l++;
		}
		insertRight(nums, p,r);
		return nums;
		
	}
	public static void insertRight(int []nums,int p,int r) {
		while(p<r) {
			if(nums[p+1]<nums[p]){
				swap(nums,p,(p+1));
			}
			p++;
		}
	}
	public static void swap(int []arr, int l, int p) {
		arr[l] = arr[l]+arr[p];
		arr[p] = arr[l]-arr[p];
		arr[l] = arr[l]-arr[p];
	}

}
