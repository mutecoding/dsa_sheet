package dsaTirth;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {20,30,40,50,60,70,80,90};
		int target =70;
		
		System.out.print(_BinarySearch(nums,target));
	}
	
	public static int _BinarySearch(int []nums, int target) {
		int lp=0, hp=nums.length-1;
		while(lp<=hp) {
			int mid = (lp + hp)/2;
			if(nums[mid]==target) {
				return mid;
			}else if(nums[mid]>target) {
				hp=mid-1;
			}else {
				lp= mid+1;
			}
		}
		return -1;
	}
}
