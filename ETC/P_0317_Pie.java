package PRACTICE;

public class P_0317_Pie {
	public static void main(String[] args) {
		String pie = "1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679";
		int[] cnts = new int[10];
		for (int i = 0; i < pie.length(); i++) {
			int cnt = 0;
			char ch = pie.charAt(i);
			cnt++;
			cnts[ch - '0'] += cnt;
		}

		for (int i = 0; i < cnts.length; i++) {
			System.out.println(i + ":" + cnts[i] + "°³");
		}
	}
}
