package PRACTICE;

import java.util.Scanner;

public class P_0324_Average {

	/*
	 * �����̰� ����ġ�� ������ �� ���� ������ �������� ����, ����, ���, ����, �����̴�.
	 * 
	 * ���� �� ������ �⸻��簡 �־���, �����̴� ���� �л����� �⸻��� �������� ä���ϰ� �ִ�. �⸻��� ������ 40�� �̻��� �л����� ��
	 * ���� �״�� �ڽ��� ������ �ȴ�. ������, 40�� �̸��� �л����� �����н��� ��� ������ �����ϸ� 40���� �ް� �ȴ�. �����н��� �ź���
	 * �� ���� ������, 40�� �̸��� �л����� �׻� 40���� �ް� �ȴ�.
	 * 
	 * �л� 5���� ������ �־����� ��, ��� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	public static int solution(int score[]) {
		int average = 0;
		
		for(int i=0; i<score.length; i++) {
			if(score[i] < 40) {
				score[i] = 40;	
			}
		}
		
		
		for(int j=0; j<score.length; j++) {
			average += score[j];
		}
		
		average = average/score.length;
	
		return average;
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int score[] = new int[5];

		System.out.println("���� ����:");
		score[0] = scn.nextInt();
		System.out.println("���� ����:");
		score[1] = scn.nextInt();
		System.out.println("��� ����:");
		score[2] = scn.nextInt();
		System.out.println("���� ����:");
		score[3] = scn.nextInt();
		System.out.println("���� ����:");
		score[4] = scn.nextInt();
		scn.close();
		
		
		System.out.println(solution(score));

	}

}
