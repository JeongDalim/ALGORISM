
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
피보나치 수열이란, 첫 번째 항의 값이 0이고 두 번째 항의 값이 1일 때, 이후의 항들은 이전의 두 항을 더한 값으로 이루어지는 수열을 말한다.

예) 0, 1, 1, 2, 3, 5, 8, 13

인풋을 정수 n으로 받았을때, n번째의 피보나치 수열을 출력하는 프로그램을 작성하세요.
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
