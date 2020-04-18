package PRACTICE;

import java.util.Scanner;
/*
� ���� ���� X�� �� �ڸ��� ���������� �̷�ٸ�,�� ���� �Ѽ���� �Ѵ�.���������� ���ӵ� �� ���� ���� ���̰� ������ ������ ���Ѵ�.
N�� �־����� ��,1 ���� ũ�ų� ����,N���� �۰ų� ���� �Ѽ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/

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