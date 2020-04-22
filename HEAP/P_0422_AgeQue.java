package HEAP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/*�¶��� ������ ������ ������� ���̿� �̸��� ������ ������� �־�����. �̶�, ȸ������ ���̰� �����ϴ� ������, 
 * ���̰� ������ ���� ������ ����� �տ� ���� ������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * ù° �ٿ� �¶��� ���� ȸ���� �� N�� �־�����. (1 �� N �� 100,000)

��° �ٺ��� N���� �ٿ��� �� ȸ���� ���̿� �̸��� �������� ���еǾ� �־�����. ���̴� 1���� ũ�ų� ������, 200���� �۰ų� ���� �����̰�, �̸��� ���ĺ� ��ҹ��ڷ� �̷���� �ְ�, ���̰� 100���� �۰ų� ���� ���ڿ��̴�. �Է��� ������ ������ �־�����.
 * 
 * ť���������;���... ���� ���鼭������ ���ο�� �˰� �� �Ͱ���^^!!
 * ���� �ڵ�и������ڤ�
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
