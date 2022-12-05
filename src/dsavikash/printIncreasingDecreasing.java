package dsavikash;

public class printIncreasingDecreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		increasingDecreasing(5);
	}
	public static void increasingDecreasing(int n) {
		if(n==1){
			return;
		}
		System.out.println(n);
		increasingDecreasing(--n);
		System.out.println(n);
	}
}
