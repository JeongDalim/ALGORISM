package HASH;

import java.util.Arrays;

public class P_0309Tellephone_list {
	/*
	 * ���� ���� ��ȭ��ȣ�ο� ���� ��ȭ��ȣ ��, �� ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 �ִ��� Ȯ���Ϸ� �մϴ�. ��ȭ��ȣ�� ������ ���� ���,
	 * ������ ��ȭ��ȣ�� �������� ��ȭ��ȣ�� ���λ��Դϴ�. ������ : 119 ���ؿ� : 97 674 223 ������ : 11 9552 4421
	 * ��ȭ��ȣ�ο� ���� ��ȭ��ȣ�� ���� �迭 phone_book �� solution �Լ��� �Ű������� �־��� ��, � ��ȣ�� �ٸ� ��ȣ��
	 * ���ξ��� ��찡 ������ false�� �׷��� ������ true�� return �ϵ��� solution �Լ��� �ۼ����ּ���.
	 * 
	 * ���� ���� phone_book�� ���̴� 1 �̻� 1,000,000 �����Դϴ�. �� ��ȭ��ȣ�� ���̴� 1 �̻� 20 �����Դϴ�.
	 */

	public static boolean solution(String[] phone_book) {
		boolean answer = true;

//���ĺ��� ���� 
		Arrays.sort(phone_book);
		for (int i = 0; i < phone_book.length - 1; i++) {
			String standard = phone_book[i];
			// ���� ���� �־��ְ�
			System.out.println(standard);

			for (int j = i + 1; j < phone_book.length; j++) {
				if (phone_book[j].startsWith(standard)) { // ���ԵǸ�
					answer = false;
				}
			}

		}

		return answer;

	}

	public static void main(String[] args) {

		 String[] phone_book = {"119", "97674223", "1195524421"}; //false
		// String[] phone_book = {"123","456","789"}; //true
		// String[] phone_book = { "12", "123", "1235", "567", "88" }; // false
		// String[] phone_book = { "12","1","2"}; //true
		 solution(phone_book);

		//System.out.println(solution(phone_book));
	}

}
