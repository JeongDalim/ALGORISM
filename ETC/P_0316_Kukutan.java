package PRACTICE;

import java.util.Scanner;

public class P_0316_Kukutan {
	/* N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��� ���Ŀ� ���缭 ����ϸ� �ȴ�. */
	public static void solution(int n) {
		System.out.println(n+"�� �������Դϴ�");
		for(int i=1; i<10; i++) {
	
		System.out.println(n +"*" +i +"=" +n*i);
		}
		
	
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("�������� ���� ������ ���ڸ� �Է����ּ���:");
		int n = scn.nextInt();
		
		scn.close();
		
		solution(n);

	}
}
