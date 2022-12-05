package dsaString;

public class LongestCommonPrefixString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strs[] = {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(strs));
	}
	public static String longestCommonPrefix(String[] strs) {
        String lps = strs[0];
        for(int i=1; i<strs.length; i++) {
            String crs= strs[i];
            String crlps = "";
            int p1=0,p2=0;
            while(p1<lps.length()&&p2<crs.length()){
                if(lps.charAt(p1)!=crs.charAt(p2)){
                    break;
                }
                crlps = crlps+lps.charAt(p1);
                p1++;
                p2++;
            }
            lps = crlps;
        }
        return lps;
    }
}
