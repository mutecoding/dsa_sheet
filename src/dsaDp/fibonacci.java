package dsaDp;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		System.out.println(fibDp(n, new int[n+1]));
	}
	public static int fibDp(int n, int[] dp){
	    if(n==0||n==1){
	        return n;
	    }
	    if(dp[n]!=0){
	        return dp[n];
	    }
	    int fibn_1=fibDp(n-1, dp);
	    int fibn_2=fibDp(n-2, dp);
	    int fibn=fibn_1+fibn_2;
	    dp[n]=fibn;
	    return fibn;
	 }
}
