package PRACTICE;

import java.util.Scanner;

public class P_0404_TheRest {

	/*
	 * �� �ڿ��� A�� B�� ���� ��, A%B�� A�� B�� ���� ������ �̴�. 
	 * ���� ���, 7, 14, 27, 38�� 3���� ���� �������� 1,2,0, 2�̴�.
	 * 
	 * �� 10���� �Է¹��� ��, �̸� 42�� ���� �������� ���Ѵ�. �� ���� ���� �ٸ� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        int samecnt = 0;
        int result = 0;
 
        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt() % 42;
 
        }
 
        for (int i = 0; i < 10; i++) {
            samecnt = 0; //�ʱ�ȭ ����� ��
            for (int j = i + 1; j < 10; j++) {
                if (num[i] == num[j]) {
                    samecnt++;
                }
            }
 
            if (samecnt == 0) {
                result++;
            }
        }
 
        System.out.println(result);
    
		
	}
	
	
	
	
}
