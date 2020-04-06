package PRACTICE;

import java.util.Scanner;

public class P_0405_Average2 {
	/*
	 * �����̴� �⸻��縦 ���ƴ�. �����̴� ������ �����ؼ� ���� ��������� �ߴ�. �ϴ� �����̴� �ڱ� ���� �߿� �ִ��� �����. �� ����
	 * M�̶�� �Ѵ�. �׸��� ���� ��� ������ ����/M*100���� ���ƴ�.
	 * 
	 * ���� ���, �������� �ְ����� 70�̰�, ���������� 50�̾����� ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.
	 * 
	 * �������� ������ ���� ������ ���� ������� ��, ���ο� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * ù° �ٿ� ���� �� ������ ���� N�� �־�����. �� ���� 1000���� �۰ų� ����. ��° �ٿ� �������� ���� ������ �־�����. �� ����
	 * 100���� �۰ų� ���� ���� �ƴ� �����̰�, ��� �ϳ��� ���� 0���� ũ��.
	 */

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int N = scn.nextInt(); // ���� ����
		double max = 0;
		double average =0;
		double score[] = new double[N];
		double result [] = new double[N];
		

		// �ִ� �� ���� ã��
		for (int i = 0; i < N; i++) {
			score[i] = scn.nextInt();
			if(max<score[i]) {
				max =score[i];
			}	}
		
		scn.close();

		// �� ������
		for(int i=0; i<N; i++) {
			result[i] = score[i]/max* 100.0;
			average +=result[i];
		}
		
		average = average/N;
		
		System.out.println(average);

	}
}
