package PRACTICE;

import java.util.Scanner;

public class P_0409_CharTest {
	/* 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 
	 * 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오. */
	public static void main(String[] args) throws Exception {
	
		//(1) 첫번째 방법
		Scanner scn = new Scanner(System.in);
		int ch = scn.next().charAt(0);
		
		
		//(1)-1 아스키 코드 -> 숫자 
		
		//int ialpa = (int)ch; 
		
		//(1) - 2 숫자 - > 아스키코드 
		//int ch2 = scn.nextInt();
		//char calpa = (char)ch2; //문자  나오게하기 
		
		System.out.println("ch:"+ch);
		//(2)두번째 방법 
		int a = System.in.read();
		/* System.in 은 byte 값으로 문자 한 개만 읽으면서 해당 문자에 대응되는 아스키코드 값을 저장할 수 있다. */
		
		System.out.print("a:"+a);

	}

}
