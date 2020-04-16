package PRACTICE;

import java.util.Scanner;

public class P_0416_DialSangun {
	/*
	 * 전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다. 숫자를 하나 누르면
	 * 다이얼이 처음 위치로 돌아가고, 다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.
	 * 
	 * 숫자 1을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선
	 * 1초씩 더 걸린다.
	 * 
	 * 상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다. 즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다. 예를
	 * 들어, UNUCIC는 868242와 같다.
	 * 
	 * 할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 시간을 구하는 프로그램을 작성하시오.
	 * 
	 * 사진: https://www.acmicpc.net/problem/5622
	 * 
	 */
	 public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         String input = scn.nextLine().trim();
         scn.close();
        
         char arr[] = input.toCharArray();
         
         int time=0;
         for(char i : arr) {
          
        	 time += Dial(i) + 1;
        
         }
         
         System.out.println(time);
   }
   
   public static int Dial(char input){
         switch (input){
         
         case 'A':case 'B':case 'C':
                return 2;
         case 'D':case 'E':case 'F':
                return 3;
         case 'G':case 'H':case 'I':
                return 4;
         case 'J':case 'K':case 'L':
                return 5;
         case 'M':case 'N':case 'O':
                return 6;
         case 'P':case 'Q':case 'R':case 'S':
                return 7;
         case 'T':case 'U':case 'V':
                return 8;
         case 'W':case 'X':case 'Y':case 'Z':
                return 9;
         default:
                return -1; //같은 숫자면 
         }
   
   }

}
