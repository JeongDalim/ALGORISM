package PRACTICE;

import java.util.Scanner;

public class P_0407_Average3 {
	/*
	 * ���л� ��������� 90%�� �ڽ��� �ݿ��� ����� �Ѵ´ٰ� �����Ѵ�. ����� �׵鿡�� ���� ������ �˷���� �Ѵ�. ù° �ٿ��� �׽�Ʈ
	 * ���̽��� ���� C�� �־�����.
	 * 
	 * ��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����, �̾ N���� ������ �־�����.
	 * ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�. �� ���̽����� �� �پ� ����� �Ѵ� �л����� ������ �ݿø��Ͽ� �Ҽ��� ��°
	 * �ڸ����� ����Ѵ�.
	 */
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int testCase = scn.nextInt();
		int sNumber, sCount, total;
		double avg = 0.0;
		int scores[] = new int[1000];

		for (int i = 0; i < testCase; i++) {
			sNumber = scn.nextInt();
			total = 0;
			sCount =0;
			for (int j = 0; j < sNumber; j++) {
				scores[j] = scn.nextInt();
				total += scores[j];

			}
			avg = (double) total / sNumber;

			// ����� �Ѵ� �ֵ�
			for (int j = 0; j < sNumber; ++j) {
				if (scores[j] > avg) {
					sCount++;
				}
			}
			
			
			
			  System.out.printf("%.3f", 100.0 * sCount / sNumber);

		}

	}
}
