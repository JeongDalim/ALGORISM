package ARRAY;

public class P_0423_CycleArray {
	/*
	 * N 정수로 구성된 배열 A가 주어진다. 배열이 회전한다는 것은 각 요소가 하나의 색인에 의해 오른쪽으로 이동되고 배열의 마지막 요소가
	 * 1위로 이동한다는 것을 의미한다. 예를 들어 배열 A = [3, 8, 9, 7, 6]의 회전은 [6, 3, 8, 9, 7]이다(원소는 한
	 * 색인에 의해 오른쪽으로 이동하고 6은 1위로 이동한다).
	 * 
	 * 목표는 배열 A K 회전을 하는 것이다. 즉, A의 각 요소가 오른쪽 K 회전으로 이동될 것이다.
	 * 
	 * 
	 * 
	 * https://app.codility.com/c/run/trainingAQRMG2-P29/
	 * 엄청 복잡하게 풀었는데.. 이런 간단한 게있구나 ㅠㅠ
	 */
	public static int[] solution(int[] A, int K) {
		;

		int[] array = new int[A.length];

		for (int i = 0; i < A.length; i++) {
			int tempIndex = (i + K) % A.length;
			array[tempIndex] = A[i];
		}

		/*
		 * for(int a : array)
		 *  { System.out.println(" " + a); }
		 */
		return array;
	}

	public static void main(String[] args) {
		//테스트 
		int[] A = { 3, 8, 9, 7, 6 };
		int K = 2;

		solution(A, K);

	}

}
