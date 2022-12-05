package dsavikash;

public class PrintDecreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		decresing(5);
	}
	public static void decresing(int n) {
		if(n==0){
			return;
		}
		System.out.println(n);
		decresing(--n);
	}

}
