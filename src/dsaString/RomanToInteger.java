package dsaString;

import java.util.HashMap;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		String s = "MCMXCIV";
		HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        char ch = s.charAt(0);
        int preValue = hm.get(ch);
        int num = preValue;
        
        for (int i = 1; i<s.length(); i++) {
            ch = s.charAt(i);
            int curValue = hm.get(ch);
            num =num + curValue;
            if(preValue<curValue) {
                num =num - 2*preValue;
            }
            preValue = curValue;
        }
        System.out.println(num);
	}

}
