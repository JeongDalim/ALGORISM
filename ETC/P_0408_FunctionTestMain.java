package PRACTICE;

/*
Java: long sum(int[] a); (클래스 이름: Test)
a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
리턴값: a에 포함되어 있는 정수 n개의 합*/
public class P_0408_FunctionTestMain {

	public static void main(String[] args) {
		int a [] = {1,2,3,5,6,9};
		long result = 0;
		
		P_0408_FunctionTest test = new P_0408_FunctionTest();
		
		result = test.sum(a);
		
		System.out.println(result);
			
	}

}
