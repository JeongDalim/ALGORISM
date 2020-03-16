package ARRAY;

import java.util.Arrays;
import java.util.Collections;

public class P_0314Max {
	/*
	 * 0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
	 * 
	 * 예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중
	 * 가장 큰 수는 6210입니다.
	 * 
	 * 0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어
	 * return 하도록 solution 함수를 작성해주세요.
	 */

	public static String solution(int[] numbers) {
		String answer = "";
		String tmp = "";

		for (int i = 0; i < numbers.length; i++) {
			tmp += numbers[i] + "";			 // 짤라서들어감
			}

		String array_tmp[] = tmp.split("");
		
		Arrays.sort(array_tmp,Collections.reverseOrder()); 

		for(int j=0;j<array_tmp.length; j++) {
			answer+= array_tmp[j];
		}
		return answer;
	}
	
	//테스트 부분
	public static void main(String[] args) {
		 int[] numbers = { 6, 10, 2 };
		// int[] numbers = { 3, 30, 34, 5, 9 };
		//int[] numbers = { 1, 8, 3, 4, 9 };

		System.out.println(solution(numbers));

	}

}
