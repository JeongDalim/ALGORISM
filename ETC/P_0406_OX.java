package PRACTICE;

import java.util.Scanner;

public class P_0406_OX {
	/*
	 * "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의
	 * 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
	 * 
	 * "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
	 * 
	 * OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
	 */
	public static void main(String[] args) {

		int scoreCnt = 0;// 연속된 숫자에 추가해줄 점수
		int result =0;
		
		Scanner scn = new Scanner(System.in);
		System.out.print("OX 중에만 입력하세요:");

		String str = scn.nextLine();
		String strArray[] = str.split("");

		for (int i = 0; i < strArray.length; i++) {
			
			if(strArray[i].equalsIgnoreCase("O")) {
				scoreCnt +=1;
				result +=scoreCnt;
			}else {
				scoreCnt =0;

			}

		}
		System.out.println(result);
	}
}
