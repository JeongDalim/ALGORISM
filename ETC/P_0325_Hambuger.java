package PRACTICE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P_0325_Hambuger {

	/*
	 * ��ٳ��忡�� ���� �� �ȸ��� �޴��� ��Ʈ �޴��̴�. �ֹ��� ��, �ڽ��� ���ϴ� �ܹ��ſ� ���Ḧ �ϳ��� ���, ��Ʈ�� �����ϸ�, ������
	 * �հ迡�� 50���� �� ������ ��Ʈ �޴��� ������ �ȴ�.
	 * 
	 * �ܹ��Ŵ� �� 3���� �������, �ߴ�����, �ϴ����Ű� �ְ�, ����� �ݶ�� ���̴� �� ������ �ִ�.
	 * 
	 * �ܹ��ſ� ������ ������ �־����� ��, ���� �� ��Ʈ �޴��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է��� �� �ټ� ���̴�. ù° �ٿ��� �������, ��° �ٿ��� �ߴ�����, ��° �ٿ��� �ϴ������� ������ �־�����. ��° �ٿ��� �ݶ��� ����,
	 * �ټ�° �ٿ��� ���̴��� ������ �־�����. ��� ������ 100�� �̻�, 2000�� �����̴�.
	 * 
	 */

	public static void main(String args[]) throws IOException {//���� ���� 
		int mostLow = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int burger = 2001;
		int drink = 2001; //�ʱ�ȭ ���ֱ� 

		for (int i = 0; i < 3; i++) {
			System.out.println(i+1+"��° �����Է�(��3����):");
			int value = Integer.parseInt(br.readLine());
			if (value < burger) {	// �ּڰ� ã��
				burger = value;
			}
		}
 
		// ����
		for (int i = 0; i < 2; i++) {
			System.out.println(i+1+"��° �����Է�(��2����):");
			int value = Integer.parseInt(br.readLine());
			if (value < drink) {	// �ּڰ� ã��
				drink = value;
			}
		}
		
		mostLow = burger + drink - 50;
		
		System.out.println(mostLow);
	}
		
		
	}
