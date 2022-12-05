package dsaString;

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = " shjs; hsl 20-1 l ahjd a";
		System.out.print(isPalindrome(s));
	}
	public static boolean isPalindrome(String s) {
        String ans="";
       for(int i=0; i<s.length(); i++){
           char ch= s.charAt(i);
           int value = ch;
           if(value>=97&&value<=122||value>=48&&value<=57){
               ans = ans+ch;
           }
           if(value>=65&&value<=90){
               value +=32;
               ch = (char)value;
               ans = ans+ch;
           }
       }
       int i=0, j=ans.length()-1;
        while(i<=j){
            if(ans.charAt(i) != ans.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
