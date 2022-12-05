package dsavikash;
import java.util.*;
public class NGTR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {2,5,9,3,1,12,6,8,7};
		Stack <Integer> st = new Stack<>();
//		st.push(nums[nums.length-1]);
//		System.out.println(nums[nums.length-1]+"; -1" );
		for(int i=nums.length-1;i>=0; i--) {
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
