package PRACTICE;

import java.util.Scanner;

public class P_0411_IndexOf {
	/*
	 * ���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. ������ ���ĺ��� ���ؼ�, �ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��, ���ԵǾ�
	 * ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * ù° �ٿ� �ܾ� S�� �־�����. �ܾ��� ���̴� 100�� ���� ������, ���ĺ� �ҹ��ڷθ� �̷���� �ִ�.
	 * 
	 * ������ ���ĺ��� ���ؼ�, a�� ó�� �����ϴ� ��ġ, b�� ó�� �����ϴ� ��ġ, ... z�� ó�� �����ϴ� ��ġ�� �������� �����ؼ�
	 * ����Ѵ�.
	 * 
	 * ����, � ���ĺ��� �ܾ ���ԵǾ� ���� �ʴٸ� -1�� ����Ѵ�. �ܾ��� ù ��° ���ڴ� 0��° ��ġ�̰�, �� ��° ���ڴ� 1��°
	 * ��ġ�̴�.
	 */
	public static void main(String[] args) {

		String s = "baekjoon";
		char alpabet[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

		int result[] = new int[alpabet.length];

			for (int i = 0; i < alpabet.length; i++) {
				for (int j = 0; j < s.length(); j++) {
				if (alpabet[i] == s.charAt(j)) {
					// ���� �� ������
					char temp = s.charAt(j);	
					result[i] = s.indexOf(temp);
					break;
				}else {
					
					result[i] = -1;
				}			
		}
		// ���
		

	}
		for (int i = 0; i < result.length; i++) {
			System.out.print(" "+ result[i]);
		}
	}
}
