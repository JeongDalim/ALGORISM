package PRACTICE;

import java.util.Scanner;

public class P_0410_Nsum {
	/*
	 * N���� ���ڰ� ���� ���� �����ִ�. �� ���ڸ� ��� ���ؼ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ù° �ٿ� ������ ���� N (1 �� N ��
	 * 100)�� �־�����. ��° �ٿ� ���� N���� ������� �־�����. �Է����� �־��� ���� N���� ���� ����Ѵ�.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/*
		 * int ���� char ���� + �Ǵ� - �����ڸ� ����� ��� char���� int ������ ��ȯ�Ǿ� ����. �̸� Ȱ������
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
