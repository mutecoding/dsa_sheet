package dsaPractice;

public class FirstAndLastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {1,2,3,4,5,4,3,4,7,6,7};
		firstandLastIndex(nums,5);
	}
	public static void firstandLastIndex(int []nums, int target) {
		int start = 0, end = nums.length-1;
		int fIndex=-1, lIndex=nums.length;
		while(start<=end) {
			if(fIndex==-1&&nums[start]==target) {
				fIndex = start;
			}
			if(lIndex==nums.length&&nums[end]==target) {
				lIndex = end;
			}
			if(fIndex!=-1&&lIndex!=nums.length) {
				break;
			}
			if(fIndex==-1) {
				start++;
			}
			if(lIndex==nums.length) {
				end--;
			}
			
		}
		System.out.println(fIndex+" "+lIndex);
		
	}

}
