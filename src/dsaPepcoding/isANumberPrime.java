package dsaPepcoding;

public class isANumberPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPrimeNumber(41));
		System.out.println(isPrimeNumberEfficentWay(41));
	}
	public static boolean isPrimeNumber(int n) {
		int div=2;
		while(div<n) {
			System.out.print(div+"->");
			if(n%div==0) {
				return false;
			}
			div++;
		}
		return true;
	}
	public static boolean isPrimeNumberEfficentWay(int n) {
		int div=2;
		while(div*div<=n) {
			System.out.print(div+"->");
			if(n%div==0) {
				return false;
			}
			div++;
		}
		return true;
	}
}
