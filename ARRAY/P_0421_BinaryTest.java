package ARRAY;

import java.util.Arrays;
import java.util.Scanner;

public class P_0421_BinaryTest {
	/*
	 * 양의 정수 N이 주어진 경우 가장 긴 이진 간격의 길이를 반환한다. N에 이진 간격이 없으면 함수는 0을 반환해야 한다.
	 * 예를 들어, N = 1041로 주어진 함수는 5를 반환해야 한다. N은 이진 표현 10000010001을 가지고 있기 때문에 가장 긴 이진
	 * 간격은 5이다. N = 32인 경우, N은 이진 표현 '100000'을 가지므로 이진 간격이 없기 때문에 함수는 0을 반환해야 한다.
	 * 
	 * 문제 저작권 때문에 https://app.codility.com/c/run/trainingV54HA7-JJS/
	 * 
	 * 프로그램내 검사에서는 통과됐는데 정밀검사에서 70점나와서 남의 것 참고해서 100점으로 완성해놓음 ㅠㅠ
	 */

	public static int solution(int n) {
		// 이진수부터 먼저 구해
		int[] b = new int[32];
		String  binary = "";
		int i = 0;
		while (n != 1) {
			b[i++] = n % 2;
			n = n / 2;
		}
		b[i] = n;

		for (int j = i; j >= 0; --j) {
			 binary += b[j];
		}

		String return0 = binary.substring(binary.length()-1, binary.length());
		String binaryArr[] = binary.split("1"); //굿 
		int Narr[] = new int[binaryArr.length];
		
		//맨 뒤에가 0이면 맨 뒤에 값을 제외하고 값을 담는다.
		if(return0.equals("0"))
			Narr = new int[binaryArr.length-1];
		
		for(int j=0; j<Narr.length; j++) {
			Narr[j] = binaryArr[j].length();
		}

		Arrays.sort(Narr);
		
		if(Narr.length == 0)
			return 0;
		else
			return Narr[Narr.length-1];//큰 값 뽑기 
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		scn.close();
		
		System.out.println(solution(n));

	}

}
