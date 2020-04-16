package PRACTICE;

import java.util.Scanner;

public class P_0413_MostUse {
	/*
	 * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와
	 * 소문자를 구분하지 않는다.
	 * 
	 * 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다. 첫째 줄에 이 단어에서
	 * 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
	 *
	 * <배열 사용 난무하지 말자 다림아~ char로 짜기!^^;;>
	 */
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int[] arr = new int[26]; // 영문자의 개수는 26개임

		String str = scn.nextLine();
		scn.close();
		
		
		for (int i = 0; i < str.length(); i++) {

			if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
				arr[str.charAt(i) - 'A']++;
				// 0부터 들어가 그러면
			} else {
				// 소문자 일때
				arr[str.charAt(i) - 'a']++;
			}

		}

		int max = -1;
		char ch = '?';

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i+'A'); //문제에서 대문자로 표현해야하잖아
			}

			else if (max == arr[i]) {
				ch = '?';
			}

		}

		System.out.println(ch);

	}
}
