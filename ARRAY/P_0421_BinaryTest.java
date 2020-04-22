package ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class P_0421_BinaryTest {
	/*
	 * ���� ���� N�� �־��� ��� ���� �� ���� ������ ���̸� ��ȯ�Ѵ�. N�� ���� ������ ������ �Լ��� 0�� ��ȯ�ؾ� �Ѵ�.
	 * ���� ���, N = 1041�� �־��� �Լ��� 5�� ��ȯ�ؾ� �Ѵ�. N�� ���� ǥ�� 10000010001�� ������ �ֱ� ������ ���� �� ����
	 * ������ 5�̴�. N = 32�� ���, N�� ���� ǥ�� '100000'�� �����Ƿ� ���� ������ ���� ������ �Լ��� 0�� ��ȯ�ؾ� �Ѵ�.
	 * 
	 * ���� ���۱� ������ https://app.codility.com/c/run/trainingV54HA7-JJS/
	 * 
	 * ���α׷��� �˻翡���� ����ƴµ� ���а˻翡�� 70�����ͼ� ���� �� �����ؼ� 100������ �ϼ��س��� �Ф�
	 */

	public static int solution(int n) {
		// ���������� ���� ����
		int[] b = new int[32];
		String  binary = "";
		int i = 0;
		while (n != 1) {
			b[i++] = n % 2;
			n = n / 2;
		}
		b[i] = n;

		for (int j = i; j >= 0; --j) {
			 binary += b[j];
		}

		String return0 = binary.substring(binary.length()-1, binary.length());
		String binaryArr[] = binary.split("1"); //�� 
		int Narr[] = new int[binaryArr.length];
		
		//�� �ڿ��� 0�̸� �� �ڿ� ���� �����ϰ� ���� ��´�.
		if(return0.equals("0"))
			Narr = new int[binaryArr.length-1];
		
		for(int j=0; j<Narr.length; j++) {
			Narr[j] = binaryArr[j].length();
		}

		Arrays.sort(Narr);
		
		if(Narr.length == 0)
			return 0;
		else
			return Narr[Narr.length-1];//ū �� �̱� 
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		scn.close();
		
		System.out.println(solution(n));

	}

}
