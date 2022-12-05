package dsaTirth;

import java.util.Arrays;

public class FibonacciRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {-1,-1,-1,-1,-1,-1,-1,-1,-1};
		System.out.println(fibonacci(8,nums));
		System.out.println(Arrays.toString(nums));	}
	public static int fibonacci(int n,int []nums) {
		if(n<=1) {
			nums[n] = n;
			return n;
		}
		if(nums[n]!=-1) return nums[n];
		int fn_1= fibonacci(n-1, nums);
		int fn_2= fibonacci(n-2, nums);
		int fn= fn_1+fn_2;
		nums[n] = fn;
		return fn;

	}
	public static void prefixSum(int []nums) {
		int sum =0;
		for(int i=0;i<nums.length;i++) {
			nums[i]=nums[i]+sum;
			sum = sum+nums[i];
		}
	}
}
