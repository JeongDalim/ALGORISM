package ARRAY;

import java.util.Arrays;

public class P_0313Karry {
	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int index = 0;
		
		for(int i = 0; i < commands.length; i++) {

			int pointI = commands[i][0];
			int pointJ = commands[i][1];
			int pointK= commands[i][2];

			int temp[] = new int[(pointJ - pointI) + 1];
			int cnt = 0;

			for(int j = pointI - 1; j < pointJ; j++) 
				temp[cnt++] = array[j];
				Arrays.sort(temp);
				answer[index++] = temp[pointK-1];
			
		}

		
		/*
		 * for(int h=0; h<answer.length; h++) { System.out.println(answer[h]); }
		 */
		return answer;

	}

	public static void main(String[] args) {

		int[] array = { 1, 5, 2, 6, 3, 7, 4 };

		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		// i,j,k
		solution(array, commands);

	}
}
