package PRACTICE;

import java.util.Arrays;
import java.util.Scanner;

public class P_0401_Maxbasic {
	/*
	 * N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. ù° �ٿ� �־��� ���� N���� �ּڰ��� �ִ��� ��������
	 * ������ ����Ѵ�.
	 * 
	 * ù° �ٿ� ������ ���� N (1 �� N �� 1,000,000)�� �־�����. ��° �ٿ��� N���� ������ �������� �����ؼ� �־�����. ���
	 * ������ -1,000,000���� ũ�ų� ����, 1,000,000���� �۰ų� ���� �����̴�.
	 * 
	 * ���� �Է� ) 20 10 35 30 7 ���) 7 35
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int N = scn.nextInt();
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = scn.nextInt();
		}

		scn.close();
		Arrays.sort(arr);
		System.out.print(arr[0] + " " + arr[N - 1]);
	}
}
