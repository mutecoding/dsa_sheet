package dsaTirth;

public class KthBitSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int k=1;
		int mask =1;
		mask = mask<<k;
		mask = n&mask;
		if(mask>0) {
			System.out.print(true);
		}else {
			System.out.print(false);
		}
		
		// seting kth bit
		
		n=5;
		k=1;
		k = n<<k;
		n = n|k;
		
		System.out.print(count1Bit(5));
	}
	public static int count1Bit(int n){
		  int count = 0;
		  int val;
		  while(n != 0){
		      val = n & 1;
		      if(val == 1){
		          ++count;
		      }
		      
		      n = n >> 1;
		  }
		  
		  return count;
		}


}
