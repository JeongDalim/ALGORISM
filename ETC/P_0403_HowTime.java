package PRACTICE;

import java.util.Scanner;

public class P_0403_HowTime {
	/*
	 * �� ���� �ڿ��� A, B, C�� �־��� �� A��B��C�� ����� ����� 0���� 9���� ������ ���ڰ� �� ���� ���������� ���ϴ� ���α׷���
	 * �ۼ��Ͻÿ�.
	 * 
	 * ���� ��� A = 150, B = 266, C = 427 �̶��
	 * 
	 * A �� B �� C = 150 �� 266 �� 427 = 17037300 �� �ǰ�,
	 * 
	 * ����� ��� 17037300 ���� 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������.
	 *
	 *
	 *�����ϰ� ­�� �ٸ���~.... ������ while������ int�θ� ó������ 
	 */

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.print("A:");
		int A = scn.nextInt();
		System.out.print("B:");
		int B = scn.nextInt();
		System.out.print("C:");
		int C = scn.nextInt();

		scn.close();
		
		String temp = A*B*C+"";
		
		String [] abc = temp.split("");
		String [] standard = {"0","1","2","3","4","5","6","7","8","9"};
		int cnt [] = new int[standard.length];

		for(int i=0; i<abc.length; i++) {
			for(int j=0; j<standard.length; j++) {
				
				if(abc[i].equalsIgnoreCase(standard[j])) {
					
					cnt[j] +=1;
					
				}
				
				
			}
				
			}
			
		System.out.println("A*B*C ����:" + temp);
		
		for(int k=0; k<cnt.length; k++) {
			
			
			System.out.println(k +"��" + cnt[k] + "��ŭ �ݺ�" );
		}
			
		}
		
		
		
		
	}


