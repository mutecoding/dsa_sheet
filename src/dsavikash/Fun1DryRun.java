package dsavikash;

public class Fun1DryRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(5);
	}
	public static void fun(int n) {
		if(n<=0) return;
		System.out.print(n+" ");
		fun(n-1);
		System.out.print(n+" ");
		fun(n-2);
		System.out.print(n+" ");
	}
}
