import java.util.Scanner;

/*
임의의 String 타입의 이진수를 입력받아 1을 더한후, 이진수로 출력하는 코드를 작성하라.
예)input:1111 => result:10000
*/
public class Binary {
	public static String method(String binary) {
		String binary2 = "";
		int num = 0;
		int cnt = 1;

		for (int i = binary.length(); i > 0; i--) {// 이진수 십진수 변환
			if (binary.substring(i - 1, i).equals("1")) {
				num += cnt;
			}
			cnt = cnt * 2;
		}

		num = num + 1;// 1더하기

		while (num > 0) {// 십진수 이진수 변환
			if (num % 2 == 1) {
				binary2 = "1" + binary2;
			} else {
				binary2 = "0" + binary2;
			}
			num = num / 2;
		}
		return binary2;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("input:");
		String binary = scn.nextLine();
		System.out.println(method(binary));
		scn.close();
	}
}
