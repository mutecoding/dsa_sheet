package dsavikash;

public class FirstIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {1,2,3,4,5,4,3,4,5,6,7};
		System.out.println(firstIndex(nums,4));
	}
	public static int firstIndex(int []nums, int target) {
		for(int i=0; i<nums.length; i++) {
			if (nums[i]==target) return i;
		}
		return -1;
	}
}
