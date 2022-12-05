package dsaTirth;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {-4,-3,-2,-2,-1,0,1,2,2,3,3,5};
		int size=0;
		for (int i=0; i<nums.length; ) {
			int idx=i;
			boolean flag = false;
			while(i<nums.length-2 && nums[i]==nums[i+1]) {
				size++;
				i++;	
				flag=true;
			}
			i++;
			if(flag&&(idx+1)<nums.length) {
				 nums[idx+1] = nums[i];
				i=idx+1;
			}
		}
		
		System.out.println(size);
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
	}

}
