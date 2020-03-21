package HEAP;

import java.util.PriorityQueue;

public class P_0321_Scoville {
	/*
	 * �ſ� ���� �����ϴ� Leo�� ��� ������ ���ں� ������ K �̻����� ����� �ͽ��ϴ�. ��� ������ ���ں� ������ K �̻����� ����� ����
	 * Leo�� ���ں� ������ ���� ���� �� ���� ������ �Ʒ��� ���� Ư���� ������� ���� ���ο� ������ ����ϴ�.
	 * 
	 * ���� ������ ���ں� ���� = ���� ���� ���� ������ ���ں� ���� + (�� ��°�� ���� ���� ������ ���ں� ���� * 2) Leo�� ���
	 * ������ ���ں� ������ K �̻��� �� ������ �ݺ��Ͽ� �����ϴ�. Leo�� ���� ������ ���ں� ������ ���� �迭 scoville�� ���ϴ�
	 * ���ں� ���� K�� �־��� ��, ��� ������ ���ں� ������ K �̻����� ����� ���� ����� �ϴ� �ּ� Ƚ���� return �ϵ���
	 * solution �Լ��� �ۼ����ּ���.
	 * 
	 * ���� ���� scoville�� ���̴� 1 �̻� 1,000,000 �����Դϴ�. K�� 0 �̻� 1,000,000,000 �����Դϴ�.
	 * scoville�� ���Ҵ� ���� 0 �̻� 1,000,000 �����Դϴ�. ��� ������ ���ں� ������ K �̻����� ���� �� ���� ��쿡�� -1��
	 * return �մϴ�.
	 */
	public static int solution(int[] scoville, int K) {
		int answer = 0;

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		for (int i : scoville) {
			pq.offer(i);
		}
		
		while (pq.peek() < K) { // peek : ���ĵ� ���¿� �� �տ� ���� �������� ��
			// System.out.println(pq);


			Integer a = pq.poll(); // ù��°�� ��������(��Ұ� ������) 
			Integer b = pq.poll();

			pq.offer(a + (b * 2)); //�ٽ� �־��� 

			answer++;//Ƚ�� ���� 
		}
		//System.out.println(answer);
		return answer;
	}

	
	//�׽�Ʈ 
	public static void main(String[] args) {
		int[] scoville = { 1, 2, 3, 9, 10, 12 };
		int k = 7;

		solution(scoville, k);
	}
}
