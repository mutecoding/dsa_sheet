package dsaTirth;
import java.util.ArrayList;
public class TwoSumPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {-4,-2,-1,0,1,2,3};
		int p1=0,p2=nums.length-1;
		ArrayList<ArrayList<Integer>> lists
        = new ArrayList<ArrayList<Integer>>();
		while(p1<p2) {
			int sum = nums[p1]+nums[p2];
			if(sum==0) {
				ArrayList<Integer> list= new ArrayList<>();
				list.add(nums[p1]);
				list.add(nums[p2]);
				lists.add(list);
				p1++;
				p2--;
				
			}else if (sum>0) {
				p2--;
			}else {
				p1++;
			}
		}
		for(int i=0; i<lists.size();i++) {
			System.out.print(lists.get(i));
		}

	}

}
