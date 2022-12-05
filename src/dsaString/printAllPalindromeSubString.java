package dsaString;

public class printAllPalindromeSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findAllSubString("abccbc");
	}
	public static void findAllSubString(String s) {
		for(int i=0; i<s.length();i++) {
			for(int j=i+1; j<=s.length(); j++) {
				String ss=s.substring(i, j);
				if(isPalindrome(ss))
					System.out.println(ss);
			}
		}
	}
	public static boolean isPalindrome(String s) {
		int i=0, j=s.length()-1;
		while(i<=j) {
			char c1 = s.charAt(i);
			char c2 = s.charAt(j);
			if(c1 != c2) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
