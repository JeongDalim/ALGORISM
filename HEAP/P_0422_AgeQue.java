package HEAP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/*온라인 저지에 가입한 사람들의 나이와 이름이 가입한 순서대로 주어진다. 이때, 회원들을 나이가 증가하는 순으로, 
 * 나이가 같으면 먼저 가입한 사람이 앞에 오는 순서로 정렬하는 프로그램을 작성하시오.
 * 
 * 첫째 줄에 온라인 저지 회원의 수 N이 주어진다. (1 ≤ N ≤ 100,000)

둘째 줄부터 N개의 줄에는 각 회원의 나이와 이름이 공백으로 구분되어 주어진다. 나이는 1보다 크거나 같으며, 200보다 작거나 같은 정수이고, 이름은 알파벳 대소문자로 이루어져 있고, 길이가 100보다 작거나 같은 문자열이다. 입력은 가입한 순서로 주어진다.
 * 
 * 큐를배워보고싶었다... 거의 보면서했지만 새로운걸 알게 된 것같다^^!!
 * 이제 코드밀리지말자ㅠ
 * */
public class P_0422_AgeQue {

	static class Member {
		int indate;
		int age;
		String name;

		Member(int indate, int age, String name) {
			this.indate = indate;
			this.age = age;
			this.name = name;
		}
	}

	public static void main(String[] args) throws IOException {
		PriorityQueue<Member> q1 = new PriorityQueue<Member>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Member> q = new PriorityQueue<Member>(100000, new Comparator<Member>() {
			@Override
			public int compare(Member m1, Member m2) {
				if (m1.age < m2.age) {
					return -1;
				} else if (m1.age > m2.age) {
					return 1;
				} else {
					return m1.indate - m2.indate;
				}
			}
		});

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			q.add(new Member(i, Integer.parseInt(st.nextToken()), st.nextToken()));
		}

		while (!q.isEmpty()) {
			Member m = q.poll();

			System.out.println(m.age + " " + m.name);
		}

	}
}
