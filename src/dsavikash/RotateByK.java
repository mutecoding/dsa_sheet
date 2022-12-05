package dsavikash;

public class RotateByK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {1,2,3,4,5};
		int k=3;
		k = k%nums.length;
		rotate(nums, 0, k-1);
		rotate(nums, k, nums.length-1);
		rotate(nums, 0, nums.length-1);
		for(int i=0;i<nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}
	public static void rotate(int nums[],int start, int end) {
		while(start<end) {
			nums[start] = nums[start] + nums[end];
			nums[end] = nums[start] - nums[end];
			nums[start] = nums[start] - nums[end];
			start++;
			end--;
		}
	}
}
