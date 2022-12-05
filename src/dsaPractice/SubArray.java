package dsaPractice;

public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,2,3,4,5};
				
//		for(int k=0;k<nums.length;k++) {
			for (int i=0; i<nums.length; i++) {
				System.out.print("[");
				for(int j=i; j<nums.length; j++) {
					System.out.print(nums[j]+",");
				}
				System.out.println("]");
			}
//		}
	}

}
