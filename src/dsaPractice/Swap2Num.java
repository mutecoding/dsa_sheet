package dsaPractice;

public class Swap2Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10, b = 5;
		System.out.println("a = "+a+", b= "+b);
		swap2numUsingTemp(a,b);
		System.out.println("---------------------");
		swap2numUsingAddition(a,b);
		System.out.println("---------------------");
		swap2numUsingBitWiseOperator(a,b);
	}
	public static void swap2numUsingTemp(int a, int b) {
		int temp =a;
		a=b;
		b= temp;
		System.out.println("a = "+a+", b= "+b);
	}
	public static void swap2numUsingAddition(int a, int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a = "+a+", b= "+b);
	}
	public static void swap2numUsingBitWiseOperator(int a, int b) {
		a =a^b;
		b=a^b;
		a=a^b;
		System.out.println("a = "+a+", b= "+b);
	}
	
}
