package PRACTICE;

import java.util.Scanner;

public class P_0414_SearchDango {
	/*
	 * 영어 대소문자와 띄어쓰기만으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 단,
	 * 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다. 첫 줄에 영어 대소문자와 띄어쓰기로 이루어진 문자열이 주어진다. 이
	 * 문자열의 길이는 1,000,000을 넘지 않는다. 단어는 띄어쓰기 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 또한 문자열의
	 * 앞과 뒤에는 공백이 있을 수도 있다.
	 * 
	 * 
	 * 입력 예시) The Curious Case of Benjamin Button
	 * 
	 * 출력 예시) 6
	 * 
	 * 
	 * 이렇게 쉽게 짤수 있는 문제가 맞나해서 했더니 역시나 공백처리 안해줘서 틀려서 다시 품.....^^;;
	 */
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		String str = scn.nextLine().trim(); // 입력값 앞과 뒤에 공백에 있을 수도 있으니 없애주자
		scn.close();
		
		if (str.isEmpty()) {
			System.out.println("0");

		} else {
			System.out.println(str.split(" ").length);

		}

	}
}
