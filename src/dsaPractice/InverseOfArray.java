package dsaPractice;
import java.util.Scanner;
public class InverseOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int []nums = new int[n];
		for(int i=0;i<nums.length;i++) {
			nums[i] = scn.nextInt();
		}
		scn.close();
		int []invs = new int[n];
		for(int i=0;i<invs.length;i++) {
			invs[nums[i]] = i;
		}
		for(int i=0;i<invs.length;i++) {
			System.out.print(invs[i]+" ");
		}
		

	}

}
