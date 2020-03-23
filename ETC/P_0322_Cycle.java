package PRACTICE;

import java.util.Scanner;

public class P_0322_Cycle {
	/*
	 * 0���� ũ�ų� ����, 99���� �۰ų� ���� ������ �־��� �� ������ ���� ������ �� �� �ִ�. ���� �־��� ���� 10���� �۴ٸ� �տ� 0��
	 * �ٿ� �� �ڸ� ���� �����, �� �ڸ��� ���ڸ� ���Ѵ�. �� ����, �־��� ���� ���� ������ �ڸ� ���� �տ��� ���� ���� ���� ������ �ڸ�
	 * ���� �̾� ���̸� ���ο� ���� ���� �� �ִ�. ���� ���� ����.
	 * 
	 * 26���� �����Ѵ�. 2+6 = 8�̴�. ���ο� ���� 68�̴�. 6+8 = 14�̴�. ���ο� ���� 84�̴�. 8+4 = 12�̴�. ���ο�
	 * ���� 42�̴�. 4+2 = 6�̴�. ���ο� ���� 26�̴�.
	 * 
	 * ���� ���� 4������ ���� ���� ���ƿ� �� �ִ�. ���� 26�� ����Ŭ�� ���̴� 4�̴�.
	 * 
	 * N�� �־����� ��, N�� ����Ŭ�� ���̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */

	public static int solution(int n) {
	        int number = n;
	        int count = 0;
	         
	        do {
	            number = number % 10 * 10 + (number / 10 + number % 10) % 10;
	            // �� �ڸ����� ���� �� 
	            // 1�� ���� 
	            //System.out.println("number:" + number);
	            count++;
	        } while (n != number);
	         
	       return count;
	    }


	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ���:");
		int n = scn.nextInt();
		scn.close();

		System.out.println(solution(n));


	}
}
