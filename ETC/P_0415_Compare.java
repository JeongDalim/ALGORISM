package PRACTICE;

import java.util.Scanner;

public class P_0415_Compare {
	/*
	 * ������� ���� ����� ������ ���� ���Ѵ�. ����� ���ڸ� �дµ� ������ �ִ�. �̷��� ������ ���ϴ� ����� ���ؼ� ����̴� ���� ũ�⸦
	 * ���ϴ� ������ ���־���. ����̴� �� �ڸ� �� �� ���� ĥ�ǿ� ���־���. �� ������ ũ�Ⱑ ū ���� ���غ���� �ߴ�.
	 * 
	 * ����� ���� �ٸ� ����� �ٸ��� �Ųٷ� �д´�. ���� ���, 734�� 893�� ĥ�ǿ� �����ٸ�, ����� �� ���� 437�� 398�� �д´�.
	 * ����, ����� �� ���� ū ���� 437�� ū ����� ���� ���̴�.
	 * 
	 * �� ���� �־����� ��, ����� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * ù° �ٿ� ����̰� ĥ�ǿ� ���� �� �� A�� B�� �־�����. �� ���� ���� ���� �� �ڸ� ���̸�, 0�� ���ԵǾ� ���� �ʴ�. ù° �ٿ�
	 * ����� ����� ����Ѵ�.
	 * 
	 * �и޸� �ʹ� ���̾� 
	 */
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		String a = scn.nextLine().trim();
		String b = scn.nextLine().trim();
		scn.close();

		String tempA = "";
		String tempB = "";
		String max = "";
		// ������

		for (int i = 2; i >= 0; i--) {

			tempA += a.charAt(i);
			tempB += b.charAt(i);
		}

		if (tempA.charAt(0) > tempB.charAt(0)) {
			max = tempA;
		} else {
			max = tempB;
		}

		System.out.println(max);

		
		/* �̷������� �ϴ� �� �� ���ڴ�.!
		 * int new_a = 0, new_b = 0;
		 * new_a = (a%10)*100 + ((a%100)/10)*10 + (a/100);
		 * new_b = (b%10)*100 + ((b%100)/10)*10 + (b/100);
		 * 
		 * System.out.println((new_a>new_b)?new_a:new_b);
		 * 
		 * 
		 */
		
		
		
	}
}
