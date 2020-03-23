package PRACTICE;

import java.util.Scanner;

public class P_0316_Kukutan {
	/* N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다. */
	public static void solution(int n) {
		System.out.println(n+"의 구구단입니다");
		for(int i=1; i<10; i++) {
	
		System.out.println(n +"*" +i +"=" +n*i);
		}
		
	
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("구구단을 구할 임의의 숫자를 입력해주세요:");
		int n = scn.nextInt();
		
		scn.close();
		
		solution(n);

	}
}
