package PRACTICE;

import java.util.Scanner;

public class P_0415_Compare {
	/*
	 * 상근이의 동생 상수는 수학을 정말 못한다. 상수는 숫자를 읽는데 문제가 있다. 이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를
	 * 비교하는 문제를 내주었다. 상근이는 세 자리 수 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.
	 * 
	 * 상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다.
	 * 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
	 * 
	 * 두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.
	 * 
	 * 첫째 줄에 상근이가 칠판에 적은 두 수 A와 B가 주어진다. 두 수는 같지 않은 세 자리 수이며, 0이 포함되어 있지 않다. 첫째 줄에
	 * 상수의 대답을 출력한다.
	 * 
	 * ㅠ메모리 너무 많이씀 
	 */
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		String a = scn.nextLine().trim();
		String b = scn.nextLine().trim();
		scn.close();

		String tempA = "";
		String tempB = "";
		String max = "";
		// 뒤집자

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

		
		/* 이런식으로 하는 게 더 좋겠다.!
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
