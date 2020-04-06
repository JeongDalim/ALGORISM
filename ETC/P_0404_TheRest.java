package PRACTICE;

import java.util.Scanner;

public class P_0404_TheRest {

	/*
	 * 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 
	 * 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1,2,0, 2이다.
	 * 
	 * 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
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
            samecnt = 0; //초기화 해줘야 됨
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
