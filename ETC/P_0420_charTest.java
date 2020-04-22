package PRACTICE;
/*
모든 짝수번째 숫자를 * 로 치환하시오.(홀수번째 숫자,또는 짝수번째 문자를 치환하면 안됩니다.)
Example: a1b2cde3~g45hi6 → a*b*cde*~g4*hi6
*/
public class P_0420_charTest {
	public static void main(String[] args) {
		String str = "a1b2cde3~g45hi6";
		String str2 = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c > '0' && c < '9') { //숫자냐 
				if ((i + 1) % 2 == 0) { // 짝수냐 
					c = '*';
				}
			}
			str2 += c;
		}
		System.out.println(str + " -> " + str2);
	}
}
