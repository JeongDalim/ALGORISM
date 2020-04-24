package ARRAY;

public class P_0423_CycleArray {
	/*
	 * N ������ ������ �迭 A�� �־�����. �迭�� ȸ���Ѵٴ� ���� �� ��Ұ� �ϳ��� ���ο� ���� ���������� �̵��ǰ� �迭�� ������ ��Ұ�
	 * 1���� �̵��Ѵٴ� ���� �ǹ��Ѵ�. ���� ��� �迭 A = [3, 8, 9, 7, 6]�� ȸ���� [6, 3, 8, 9, 7]�̴�(���Ҵ� ��
	 * ���ο� ���� ���������� �̵��ϰ� 6�� 1���� �̵��Ѵ�).
	 * 
	 * ��ǥ�� �迭 A K ȸ���� �ϴ� ���̴�. ��, A�� �� ��Ұ� ������ K ȸ������ �̵��� ���̴�.
	 * 
	 * 
	 * 
	 * https://app.codility.com/c/run/trainingAQRMG2-P29/
	 * ��û �����ϰ� Ǯ���µ�.. �̷� ������ ���ֱ��� �Ф�
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
		//�׽�Ʈ 
		int[] A = { 3, 8, 9, 7, 6 };
		int K = 2;

		solution(A, K);

	}

}
