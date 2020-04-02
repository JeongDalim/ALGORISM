package PRACTICE;
import java.util.Scanner;
/*
두 자연수 M,N이 있을 때, M의 진약수들의 합이 N이 되고, N의 진약수들의 합이 M이 되면 M, N을 친화수라고 한다. 예) 284,220
임의의 정수 M,N를 입력받아 친화수인지 아닌지 구별하는 코드를 작성하시오.
*/
public class P_0402_AmicableNumbers {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("친화수를 구하는 프로그램입니다. 정수 2개를 입력해주세요.");
		System.out.print("첫번째 수:");
		int num1 = scn.nextInt();
		System.out.print("두번째 수:");
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
			System.out.println(num1 + "와" + num2 + "는 친화수입니다.");
		}else {
			System.out.println(num1 + "와" + num2 + "는 친화수가 아닙니다.");
		}

		scn.close();
	}
}
