package HASH;
// 정확도 100, 효율성 0....
import java.util.HashMap;

/*수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

제한사항
마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
completion의 길이는 participant의 길이보다 1 작습니다.
참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
참가자 중에는 동명이인이 있을 수 있습니다.

완주를 못한 사람을 리턴해라 
*/

public class P_0308Maraton {

	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<Integer, String> Pmap = new HashMap<>();

		// map에 넣어서 중복되는거는 하나씩 지워버리자
		for (int i = 0; i < participant.length; i++) {
			Pmap.put(i, participant[i]);

			for (int j = 0; j < completion.length; j++) {
				if (Pmap.get(i).equalsIgnoreCase(completion[j])) {
					// 같으면
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
	
	//테스트 
	public static void main(String[] args) {

		String[] participant = { "mislav", "stanko", "mislav", "ana", "mislav" };
		String[] completion = { "stanko", "ana", "mislav", "mislav" };

		// mislav 두개나와야됨
		System.out.println(solution(participant, completion));

	}

}
