package ARRAY;

import java.util.Arrays;
import java.util.Collections;

public class P_0314Max {
	/*
	 * 0 �Ǵ� ���� ������ �־����� ��, ������ �̾� �ٿ� ���� �� �ִ� ���� ū ���� �˾Ƴ� �ּ���.
	 * 
	 * ���� ���, �־��� ������ [6, 10, 2]��� [6102, 6210, 1062, 1026, 2610, 2106]�� ���� �� �ְ�, ����
	 * ���� ū ���� 6210�Դϴ�.
	 * 
	 * 0 �Ǵ� ���� ������ ��� �迭 numbers�� �Ű������� �־��� ��, ������ ���ġ�Ͽ� ���� �� �ִ� ���� ū ���� ���ڿ��� �ٲپ�
	 * return �ϵ��� solution �Լ��� �ۼ����ּ���.
	 */

	public static String solution(int[] numbers) {
		String answer = "";
		String tmp = "";

		for (int i = 0; i < numbers.length; i++) {
			tmp += numbers[i] + "";			 // ©�󼭵�
			}

		String array_tmp[] = tmp.split("");
		
		Arrays.sort(array_tmp,Collections.reverseOrder()); 

		for(int j=0;j<array_tmp.length; j++) {
			answer+= array_tmp[j];
		}
		return answer;
	}
	
	//�׽�Ʈ �κ�
	public static void main(String[] args) {
		 int[] numbers = { 6, 10, 2 };
		// int[] numbers = { 3, 30, 34, 5, 9 };
		//int[] numbers = { 1, 8, 3, 4, 9 };

		System.out.println(solution(numbers));

	}

}
