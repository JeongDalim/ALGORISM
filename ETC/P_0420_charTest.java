package PRACTICE;
/*
��� ¦����° ���ڸ� * �� ġȯ�Ͻÿ�.(Ȧ����° ����,�Ǵ� ¦����° ���ڸ� ġȯ�ϸ� �ȵ˴ϴ�.)
Example: a1b2cde3~g45hi6 �� a*b*cde*~g4*hi6
*/
public class P_0420_charTest {
	public static void main(String[] args) {
		String str = "a1b2cde3~g45hi6";
		String str2 = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c > '0' && c < '9') { //���ڳ� 
				if ((i + 1) % 2 == 0) { // ¦���� 
					c = '*';
				}
			}
			str2 += c;
		}
		System.out.println(str + " -> " + str2);
	}
}
