package PRACTICE;
import java.util.Scanner;
/*
�� �ڿ��� M,N�� ���� ��, M�� ��������� ���� N�� �ǰ�, N�� ��������� ���� M�� �Ǹ� M, N�� ģȭ����� �Ѵ�. ��) 284,220
������ ���� M,N�� �Է¹޾� ģȭ������ �ƴ��� �����ϴ� �ڵ带 �ۼ��Ͻÿ�.
*/
public class P_0402_AmicableNumbers {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("ģȭ���� ���ϴ� ���α׷��Դϴ�. ���� 2���� �Է����ּ���.");
		System.out.print("ù��° ��:");
		int num1 = scn.nextInt();
		System.out.print("�ι�° ��:");
		int num2 = scn.nextInt();

		int sum1 = 0;
		int sum2 = 0;

		for (int i = 1; i < num1; i++) {
			if (num1 % i == 0) {
				sum1 += i;
			}
		}
		for (int i = 1; i < num2; i++) {
			if (num2 % i == 0) {
				sum2 += i;
			}

		}
		if (sum1 == num2 && sum2==num1) {
			System.out.println(num1 + "��" + num2 + "�� ģȭ���Դϴ�.");
		}else {
			System.out.println(num1 + "��" + num2 + "�� ģȭ���� �ƴմϴ�.");
		}

		scn.close();
	}
}
