package PRACTICE;

import java.util.Scanner;

public class P_0413_MostUse {
	/*
	 * ���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. ��, �빮�ڿ�
	 * �ҹ��ڸ� �������� �ʴ´�.
	 * 
	 * ù° �ٿ� ���ĺ� ��ҹ��ڷ� �̷���� �ܾ �־�����. �־����� �ܾ��� ���̴� 1,000,000�� ���� �ʴ´�. ù° �ٿ� �� �ܾ��
	 * ���� ���� ���� ���ĺ��� �빮�ڷ� ����Ѵ�. ��, ���� ���� ���� ���ĺ��� ���� �� �����ϴ� ��쿡�� ?�� ����Ѵ�.
	 *
	 * <�迭 ��� �������� ���� �ٸ���~ char�� ¥��!^^;;>
	 */
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int[] arr = new int[26]; // �������� ������ 26����

		String str = scn.nextLine();
		scn.close();
		
		
		for (int i = 0; i < str.length(); i++) {

			if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
				arr[str.charAt(i) - 'A']++;
				// 0���� �� �׷���
			} else {
				// �ҹ��� �϶�
				arr[str.charAt(i) - 'a']++;
			}

		}

		int max = -1;
		char ch = '?';

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i+'A'); //�������� �빮�ڷ� ǥ���ؾ����ݾ�
			}

			else if (max == arr[i]) {
				ch = '?';
			}

		}

		System.out.println(ch);

	}
}
