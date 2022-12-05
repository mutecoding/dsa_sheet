package dsaTirth;

public class SquareArray {
	public static void main(String []args) {
		int nums[] = {-4,-3,-2,0,1,4};
		for(int i=0;i<nums.length;i++) {
			nums[i] = nums[i] *nums[i] ;
		}
		int p1=0, p2=nums.length-1, p3=nums.length-1;
		int res[] = new int[nums.length];
		while(p1<p2) {
			if (nums[p1]<nums[p2]) {
				res[p3]=nums[p2];
				p2--;
			}else {
				res[p3]=nums[p1];
				p1++;
			}
			p3--;
			
			
		}
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}

		
	}
}
