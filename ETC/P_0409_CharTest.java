package PRACTICE;

import java.util.Scanner;

public class P_0409_CharTest {
	/* ���ĺ� �ҹ���, �빮��, ���� 0-9�� �ϳ��� �־����� ��, 
	 * �־��� ������ �ƽ�Ű �ڵ尪�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. */
	public static void main(String[] args) throws Exception {
	
		//(1) ù��° ���
		Scanner scn = new Scanner(System.in);
		int ch = scn.next().charAt(0);
		
		
		//(1)-1 �ƽ�Ű �ڵ� -> ���� 
		
		//int ialpa = (int)ch; 
		
		//(1) - 2 ���� - > �ƽ�Ű�ڵ� 
		//int ch2 = scn.nextInt();
		//char calpa = (char)ch2; //����  �������ϱ� 
		
		System.out.println("ch:"+ch);
		//(2)�ι�° ��� 
		int a = System.in.read();
		/* System.in �� byte ������ ���� �� ���� �����鼭 �ش� ���ڿ� �����Ǵ� �ƽ�Ű�ڵ� ���� ������ �� �ִ�. */
		
		System.out.print("a:"+a);

	}

}
