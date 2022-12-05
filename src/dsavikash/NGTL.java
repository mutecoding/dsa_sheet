package dsavikash;
import java.util.*;
public class NGTL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {2,5,9,3,1,12,6,8,7};
		Stack <Integer> st = new Stack<>();
		st.push(nums[0]);
		System.out.println(nums[0]+"; -1" );
		for(int i=1;i<nums.length; i++) {
			while(!st.isEmpty()&&st.peek()<=nums[i]) {
				st.pop();
			}
			if(st.isEmpty()) {
				System.out.println(nums[i]+"; -1" );
			}else {
				System.out.println(nums[i]+": "+st.peek());
			}
			st.push(nums[i]);
			
		}

	}

}
