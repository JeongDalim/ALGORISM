package PRACTICE;

import java.util.Scanner;

public class P_0414_SearchDango {
	/*
	 * ���� ��ҹ��ڿ� ���⸸���� �̷���� ���ڿ��� �־�����. �� ���ڿ����� �� ���� �ܾ ������? �̸� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. ��,
	 * �� �ܾ ���� �� �����ϸ� ������ Ƚ����ŭ ��� ����� �Ѵ�. ù �ٿ� ���� ��ҹ��ڿ� ����� �̷���� ���ڿ��� �־�����. ��
	 * ���ڿ��� ���̴� 1,000,000�� ���� �ʴ´�. �ܾ�� ���� �� ���� ���еǸ�, ������ �����ؼ� ������ ���� ����. ���� ���ڿ���
	 * �հ� �ڿ��� ������ ���� ���� �ִ�.
	 * 
	 * 
	 * �Է� ����) The Curious Case of Benjamin Button
	 * 
	 * ��� ����) 6
	 * 
	 * 
	 * �̷��� ���� ©�� �ִ� ������ �³��ؼ� �ߴ��� ���ó� ����ó�� �����༭ Ʋ���� �ٽ� ǰ.....^^;;
	 */
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		String str = scn.nextLine().trim(); // �Է°� �հ� �ڿ� ���鿡 ���� ���� ������ ��������
		scn.close();
		
		if (str.isEmpty()) {
			System.out.println("0");

		} else {
			System.out.println(str.split(" ").length);

		}

	}
}
