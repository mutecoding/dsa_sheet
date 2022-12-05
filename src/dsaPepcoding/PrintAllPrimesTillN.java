package dsaPepcoding;
import java.util.Scanner;
public class PrintAllPrimesTillN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int low = scn.nextInt(), high = scn.nextInt();
		scn.close();
		for(int i=low;i<=high; i++) {
			if(isPrimeNumberEfficentWay(i)) {
				System.out.println(i);
			}
		}
	}
	public static boolean isPrimeNumberEfficentWay(int n) {
		int div=2;
		while(div*div<=n) {
			if(n%div==0) {
				return false;
			}
			div++;
		}
		return true;
	}
}
