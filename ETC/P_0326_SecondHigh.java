package PRACTICE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_0326_SecondHigh {
	/* 세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오. */ 
	//배열 쓰지말아보기 
	public static int solution(int a, int b, int c) {

		int max = 0;
		int mid = 0;
		int min = 0;

		// 최대 값
		if (a > b) { // a는 b,c랑 비교
			max = a;
			if (max < c) {
				max = c;
			}
		} else {
			max = b;
			if (max < c) {
				max = c;
			}
		}

		// 최소 값
		if (a > b) { // a는 b,c랑 비교
			min = b;
			if (min > c) {
				min = c;
			}
		} else {
			min = a;
			if (min > c) {
				min = c;
			}
		}

		//중간 값 
			if(a!=max&&a!=min) {
				mid = a;
			}
			if(b!=max&&b!=min) {
				mid = b;
			}	
			if(c!=max&&c!=min) {
				mid = c;
			}
		

		return mid;
	}

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("a 입력:");
		int a = Integer.parseInt(br.readLine());

		System.out.println("b 입력:");
		int b = Integer.parseInt(br.readLine());

		System.out.println("c 입력:");
		int c = Integer.parseInt(br.readLine());

		System.out.println(solution(a, b, c));
	}
}
