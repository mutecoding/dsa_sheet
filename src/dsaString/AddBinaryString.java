package dsaString;

public class AddBinaryString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "1010";
		String b = "1010";
		System.out.println(addBinary(a,b));
	}
	public static String addBinary(String a, String b) {
        int carry = 0;
        int p=a.length()-1, q=b.length()-1;
        String s = "";
        while(p>=0&&q>=0){
            char ac = a.charAt(p);
            char bc = b.charAt(q);
            int sum = carry;
            if(ac=='1'){
                sum +=1;
            }
            if(bc=='1'){
                sum +=1;
            }
            carry = sum/2;
            sum = sum%2;
            s = sum+s;
            p--;
            q--;
            
        }
        while(p>=0){
            char ac = a.charAt(p);
            int sum = carry;
            if(ac=='1'){
                sum +=1;
            }
            carry = sum/2;
            sum = sum%2;
            s = sum+s;
            p--;
            
        }
        while(q>=0){
            char bc = b.charAt(q);
            int sum = carry;
            if(bc=='1'){
                sum +=1;
            }
            carry = sum/2;
            sum = sum%2;
            s = sum+s;
            q--;
            
        }
        if(carry == 1){
            s = carry+s;
        }
        return s;
    }
}
