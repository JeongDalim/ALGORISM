
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
�Ǻ���ġ �����̶�, ù ��° ���� ���� 0�̰� �� ��° ���� ���� 1�� ��, ������ �׵��� ������ �� ���� ���� ������ �̷������ ������ ���Ѵ�.

��) 0, 1, 1, 2, 3, 5, 8, 13

��ǲ�� ���� n���� �޾�����, n��°�� �Ǻ���ġ ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
*/
public class Fibonacci {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("input:");
		int num = scn.nextInt();
		List<Integer> FibonacciNumbers = new ArrayList<Integer>();
		FibonacciNumbers.add(0);
		FibonacciNumbers.add(1);
		for (int i = 0; i < num - 2; i++) {
			int num2 = FibonacciNumbers.get(i) + FibonacciNumbers.get(i + 1);
			FibonacciNumbers.add(num2);
		}
		System.out.println(FibonacciNumbers.get(num));
		scn.close();
	}
}
