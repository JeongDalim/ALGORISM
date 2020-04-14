package PRACTICE;

import java.util.Scanner;

public class P_0410_Nsum {
	/*
	 * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오. 첫째 줄에 숫자의 개수 N (1 ≤ N ≤
	 * 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다. 입력으로 주어진 숫자 N개의 합을 출력한다.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/*
		 * int 형과 char 형에 + 또는 - 연산자를 사용할 경우 char형이 int 형으로 변환되어 계산됨. 이를 활용하자
		 */

		int n = sc.nextInt();
		int result = 0;

		String inputs = sc.next();

		sc.close();
		for (int i = 0; i < n; ++i) {
			result += inputs.charAt(i) - '0';
		}

		System.out.println(result);

	}

}
