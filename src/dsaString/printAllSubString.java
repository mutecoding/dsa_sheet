package dsaString;

public class printAllSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSubString("abccbc");
		
		/**
		 * a
		 * ab
		 * abc
		 * abcd
		 * b
		 * bc
		 * bcd
		 * c
		 * cd
		 * d
		 */

	}
	public static void printSubString(String s) {
		for(int i=0; i<s.length();i++) {
			for(int j=i+1; j<=s.length(); j++) {
				System.out.println(s.substring(i, j));
			}
		}
	}
}
