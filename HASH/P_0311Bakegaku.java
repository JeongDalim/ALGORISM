package HASH;

import java.util.Scanner;

public class P_0311Bakegaku {


	/*
	 * [���� 6] ���� �µ��� �Է¹޾Ƽ� ȭ�� �µ��� �ٲپ� ����ϰų�, ȭ�� �µ��� ���� �µ��� �ٲپ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. �� ��
	 * ���� �µ��� ȭ�� �µ��� �ٲٴ� �Լ�CtoF�� ȭ�� �µ��� ���� �µ��� �ٲٴ� �Լ� FtoC �Լ��� �ۼ��ϰ� �̿��ϵ��� �Ѵ�.
	 * 'c','C','f','F'���� ���ڸ� �Է��ϸ� "�߸��� �Է��Դϴ�"��� �޽����� ���� ������. -> ȭ���µ� = (9/5*���� �µ�) +
	 * 32 ->���� �µ� =(ȭ�� �µ� - 32)*5/9 ��) ���� �µ��� ȭ�� �µ��� �ٲٷ��� C �Ǵ� c�� �Է��Ͻÿ�. ȭ�� �µ��� ����
	 * �µ��� �ٲٷ��� F �Ǵ� f�� �Է��Ͻÿ�. ����->c ���� �µ��� �Է��Ͻÿ� : -5 ���� -5.00���� ȭ�� 23.00�� �Դϴ�.
	 * 
	 * 
	 * 
	 */
	// �����µ��� ȭ���� �ٲٴ� �Լ�
	public static float CtoF(int subC) {
			
			float hawC = (float)(9/5*subC)+32;
			
			return hawC;
		}

	// ȭ���� �µ��� ������ �ٲٴ� �Լ�
	public static float FtoC(int hawC) {
			
			float subC = (float)(hawC-32)*5/9;
		
			return subC;
		}

	public static void main(String[] args) {
			
			System.out.println("=========================================");
			System.out.println("���� �µ��� ȭ�� �µ��� �ٲٷ��� C �Ǵ� c�� �Է��Ͻÿ�.");
			System.out.println("ȭ�� �µ��� ���� �µ��� �ٲٷ��� F �Ǵ� f�� �Է��Ͻÿ�.");
			System.out.println("=========================================");
			System.out.print("[�Է�]:");
			
			Scanner scn = new Scanner(System.in);
			String select = scn.nextLine();
			
			if(select.equalsIgnoreCase("c")) {
				System.out.print("ȭ�� �µ��� �Է����ּ���:");
				int hawC = scn.nextInt();
				float result = CtoF(hawC);
				 System.out.println(result +"�� �Դϴ�.");
				
			}else if(select.equalsIgnoreCase("f")) {
				System.out.print("���� �µ��� �Է����ּ���:");
				int subC = scn.nextInt();
				 float result = FtoC(subC);
				 System.out.println(result +"�� �Դϴ�.");
				
			}else {
				System.out.println("�߸��Է��Ͽ����ϴ�.");
				
				
			}
		}

}


