package HASH;

import java.util.Scanner;

public class P_0311Bakegaku {


	/*
	 * [문제 6] 섭씨 온도를 입력받아서 화씨 온도로 바꾸어 출력하거나, 화씨 온도를 섭씨 온도로 바꾸어 출력하는 프로그램을 작성하시오. 이 때
	 * 섭씨 온도를 화씨 온도로 바꾸는 함수CtoF와 화씨 온도를 섭씨 온도로 바꾸는 함수 FtoC 함수를 작성하고 이용하도록 한다.
	 * 'c','C','f','F'외의 문자를 입력하면 "잘못된 입력입니다"라는 메시지를 내고 끝낸다. -> 화씨온도 = (9/5*섭씨 온도) +
	 * 32 ->섭씨 온도 =(화씨 온도 - 32)*5/9 예) 섭씨 온도를 화씨 온도로 바꾸려면 C 또는 c를 입력하시오. 화씨 온도를 섭씨
	 * 온도로 바꾸려면 F 또는 f를 입력하시오. 선택->c 섭씨 온도를 입력하시오 : -5 섭씨 -5.00도는 화씨 23.00도 입니다.
	 * 
	 * 
	 * 
	 */
	// 섭씨온도를 화씨로 바꾸는 함수
	public static float CtoF(int subC) {
			
			float hawC = (float)(9/5*subC)+32;
			
			return hawC;
		}

	// 화씨를 온도를 섭씨로 바꾸는 함수
	public static float FtoC(int hawC) {
			
			float subC = (float)(hawC-32)*5/9;
		
			return subC;
		}

	public static void main(String[] args) {
			
			System.out.println("=========================================");
			System.out.println("섭씨 온도를 화씨 온도로 바꾸려면 C 또는 c를 입력하시오.");
			System.out.println("화씨 온도를 섭씨 온도로 바꾸려면 F 또는 f를 입력하시오.");
			System.out.println("=========================================");
			System.out.print("[입력]:");
			
			Scanner scn = new Scanner(System.in);
			String select = scn.nextLine();
			
			if(select.equalsIgnoreCase("c")) {
				System.out.print("화씨 온도를 입력해주세요:");
				int hawC = scn.nextInt();
				float result = CtoF(hawC);
				 System.out.println(result +"도 입니다.");
				
			}else if(select.equalsIgnoreCase("f")) {
				System.out.print("섭씨 온도를 입력해주세요:");
				int subC = scn.nextInt();
				 float result = FtoC(subC);
				 System.out.println(result +"도 입니다.");
				
			}else {
				System.out.println("잘못입력하였습니다.");
				
				
			}
		}

}


