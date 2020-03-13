package HASH;
// ��Ȯ�� 100, ȿ���� 0....
import java.util.HashMap;

/*������ ������ �������� �����濡 �����Ͽ����ϴ�. �� �� ���� ������ �����ϰ�� ��� ������ �������� �����Ͽ����ϴ�.

�����濡 ������ �������� �̸��� ��� �迭 participant�� ������ �������� �̸��� ��� �迭 completion�� �־��� ��, �������� ���� ������ �̸��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���ѻ���
������ ��⿡ ������ ������ ���� 1�� �̻� 100,000�� �����Դϴ�.
completion�� ���̴� participant�� ���̺��� 1 �۽��ϴ�.
�������� �̸��� 1�� �̻� 20�� ������ ���ĺ� �ҹ��ڷ� �̷���� �ֽ��ϴ�.
������ �߿��� ���������� ���� �� �ֽ��ϴ�.

���ָ� ���� ����� �����ض� 
*/

public class P_0308Maraton {

	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<Integer, String> Pmap = new HashMap<>();

		// map�� �־ �ߺ��Ǵ°Ŵ� �ϳ��� ����������
		for (int i = 0; i < participant.length; i++) {
			Pmap.put(i, participant[i]);

			for (int j = 0; j < completion.length; j++) {
				if (Pmap.get(i).equalsIgnoreCase(completion[j])) {
					// ������
					Pmap.put(i, "");
					completion[j] = "";
				}
			}
		}
		for (int k = 0; k < Pmap.size(); k++) {
			if (!Pmap.get(k).equalsIgnoreCase("")) {
				//System.out.println(Pmap.get(k));
				answer=Pmap.get(k);
			}
		}
		return answer;
	}
	
	//�׽�Ʈ 
	public static void main(String[] args) {

		String[] participant = { "mislav", "stanko", "mislav", "ana", "mislav" };
		String[] completion = { "stanko", "ana", "mislav", "mislav" };

		// mislav �ΰ����;ߵ�
		System.out.println(solution(participant, completion));

	}

}
