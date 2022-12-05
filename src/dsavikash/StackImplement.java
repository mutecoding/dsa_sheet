package dsavikash;

import java.util.Stack;

public class StackImplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "(((a+b)+(c+d)))";
		System.out.print(isDuplicateBraces(s));

	}
	public static boolean isDuplicateBraces(String s) {
		Stack <Character> st = new Stack<>();
		for(int i=0; i<s.length(); i++) {
			char c =s.charAt(i);
			if(c==')') {
				if(st.peek()=='(') {
					return true;
				}else {
					while(st.peek()!='(') {
						st.pop();
					}
					st.pop();
				}
			}else { 
				st.push(c);
			}
		}
		return false;
	}

}
class MyStack {
	int top;
	public void push(int data) {
		top++;
//		list.add(data);
	}
}