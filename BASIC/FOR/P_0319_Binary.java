import java.util.Scanner;

/*
������ String Ÿ���� �������� �Է¹޾� 1�� ������, �������� ����ϴ� �ڵ带 �ۼ��϶�.
��)input:1111 => result:10000
*/
public class Binary {
	public static String method(String binary) {
		String binary2 = "";
		int num = 0;
		int cnt = 1;

		for (int i = binary.length(); i > 0; i--) {// ������ ������ ��ȯ
			if (binary.substring(i - 1, i).equals("1")) {
				num += cnt;
			}
			cnt = cnt * 2;
		}

		num = num + 1;// 1���ϱ�

		while (num > 0) {// ������ ������ ��ȯ
			if (num % 2 == 1) {
				binary2 = "1" + binary2;
			} else {
				binary2 = "0" + binary2;
			}
			num = num / 2;
		}
		return binary2;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("input:");
		String binary = scn.nextLine();
		System.out.println(method(binary));
		scn.close();
	}
}
