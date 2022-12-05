package dsavikash;

public class PrintIncreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	increasing(5);
	}
	public static void increasing(int n) {
		if(n==0){
			return;
		}
		increasing(--n);
		System.out.println(n);
	}
	

}
