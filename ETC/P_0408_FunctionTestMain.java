package PRACTICE;

/*
Java: long sum(int[] a); (Ŭ���� �̸�: Test)
a: ���� ���ؾ� �ϴ� ���� n���� ����Ǿ� �ִ� �迭 (0 �� a[i] �� 1,000,000, 1 �� n �� 3,000,000)
���ϰ�: a�� ���ԵǾ� �ִ� ���� n���� ��*/
public class P_0408_FunctionTestMain {

	public static void main(String[] args) {
		int a [] = {1,2,3,5,6,9};
		long result = 0;
		
		P_0408_FunctionTest test = new P_0408_FunctionTest();
		
		result = test.sum(a);
		
		System.out.println(result);
			
	}

}
