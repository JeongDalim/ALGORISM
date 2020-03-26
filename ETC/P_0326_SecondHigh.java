package PRACTICE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_0326_SecondHigh {
	/* �� ���� A, B, C�� �־�����. �̶�, �� ��°�� ū ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�. */ 
	//�迭 �������ƺ��� 
	public static int solution(int a, int b, int c) {

		int max = 0;
		int mid = 0;
		int min = 0;

		// �ִ� ��
		if (a > b) { // a�� b,c�� ��
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

		// �ּ� ��
		if (a > b) { // a�� b,c�� ��
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

		//�߰� �� 
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

		System.out.println("a �Է�:");
		int a = Integer.parseInt(br.readLine());

		System.out.println("b �Է�:");
		int b = Integer.parseInt(br.readLine());

		System.out.println("c �Է�:");
		int c = Integer.parseInt(br.readLine());

		System.out.println(solution(a, b, c));
	}
}
