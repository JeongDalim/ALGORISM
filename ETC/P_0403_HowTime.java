package PRACTICE;

import java.util.Scanner;

public class P_0403_HowTime {
	/*
	 * 세 개의 자연수 A, B, C가 주어질 때 A×B×C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을
	 * 작성하시오.
	 * 
	 * 예를 들어 A = 150, B = 266, C = 427 이라면
	 * 
	 * A × B × C = 150 × 266 × 427 = 17037300 이 되고,
	 * 
	 * 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
	 *
	 *
	 *무식하게 짯다 다림아~.... 다음엔 while돌려서 int로만 처리하자 
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
			
		System.out.println("A*B*C 값은:" + temp);
		
		for(int k=0; k<cnt.length; k++) {
			
			
			System.out.println(k +"는" + cnt[k] + "만큼 반복" );
		}
			
		}
		
		
		
		
	}


