package PRACTICE;

import java.util.Scanner;

public class P_0412_RepeatString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt(); 
		for (int i = 0; i < testCase; i++) {
			int cnt = sc.nextInt();
			String str = sc.nextLine();
			String result = "";

			for (int j = 0; j < str.length(); j++) {
				for (int k = 0; k < cnt; k++)
					result += str.charAt(j);
			}
			result = result.replaceAll(" ", ""); //공백 생길 수 도 있으니깐 
			System.out.println(result);
		}
		sc.close();
	}

}
