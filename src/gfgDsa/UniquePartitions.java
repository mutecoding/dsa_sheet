package gfgDsa;

public class UniquePartitions {

	public static void main(String[] args) {
		int n=5;
		uniquePartitions(n,n,0);

	}
	public static void uniquePartitions(int n, int m, int less) {
		if(m==1) {
			System.out.print(m+" ");
			return;
		}
		System.out.print(n+" ");
		n--;
		less=n-m;
		uniquePartitions(n,n-less,less);
		
	}
}
