package PRACTICE;

import java.util.Scanner;

public class P_0406_OX {
	/*
	 * "OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�. ������ ���� ��� �� ������
	 * ������ �� �������� ���ӵ� O�� ������ �ȴ�. ���� ���, 10�� ������ ������ 3�� �ȴ�.
	 * 
	 * "OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
	 * 
	 * OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	public static void main(String[] args) {

		int scoreCnt = 0;// ���ӵ� ���ڿ� �߰����� ����
		int result =0;
		
		Scanner scn = new Scanner(System.in);
		System.out.print("OX �߿��� �Է��ϼ���:");

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
