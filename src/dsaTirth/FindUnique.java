package dsaTirth;

import java.util.HashMap;

public class FindUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {2,1,2,3,4,3,4,1,2,5};
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<nums.length; i++) {
			if(map.containsKey(nums[i])) {
				map.put(nums[i],1+map.get(nums[i]));
			}else {
				map.put(nums[i],1);
			}
		}
		for(int i=0;i<nums.length; i++) {
			if(map.get(nums[i])==1) {
				System.out.print(nums[i]);
			}
		}
	}

}
