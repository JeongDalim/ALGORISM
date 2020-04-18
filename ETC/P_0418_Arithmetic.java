package PRACTICE;

import java.util.Scanner;
/*
어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면,그 수를 한수라고 한다.등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
N이 주어졌을 때,1 보다 크거나 같고,N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.*/

public class P_0418_Arithmetic {
	private static int isHansu(int number) {
		int one = number / 100 % 10;
		int ten = number / 10 % 10;
		int hun = number % 10;

		if ((hun-ten) == (ten-one)) {
			return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();

		if (n < 100) {
			System.out.println(n);
		} else {
			int result = 99;

			for (int i = 100; i <= n; ++i) {
				result += isHansu(i);
			}

			if (n == 1000)
				result--;

			System.out.println(result);
		}
	}

}