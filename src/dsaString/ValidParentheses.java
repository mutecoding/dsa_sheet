package dsaString;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(isValid("[(())]"));
	}
	public static boolean isValid(String s) {
        String ans = ""+ s.charAt(0);
        for(int i=1;i<s.length(); i++) {
            char ch = s.charAt(i);
            boolean flag = true;
            if (ans.length()>0) {
                char c = ans.charAt((ans.length()-1));
                if(ch==')') {
                    if(c!='('){
                        return false;
                    }
                    flag = false;
                } else if(ch=='}') {
                    if(c!='{'){
                        return false;
                    }
                    flag = false;              
                } else if(ch==']') {
                    if(c!='['){
                        return false;
                    }
                    flag = false; 
                } 
            }
            if(flag){
                ans = ans + ch;
            }else{
                ans = ans.substring(0,ans.length()-1);  
            }
        }
        return ans.length()>0 ? false:true;
    }
}
