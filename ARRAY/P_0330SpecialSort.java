package ARRAY;

/*
n���� ������ ���� �迭�� �ִ�. �� �迭�� ���������� ���� ������ ��� ������ �ִ�. ���� ����� �� �迭�� �� Ư���� ������� �����ؾ� �Ѵ�.
������ �ǰ� �� ��, ���� ������ ���ʿ� ���������� ���ʿ� �־�� �Ѵ�. ���� ���������� ���������� �������� ������ ����� �Ѵ�.
��) {-1 1 3 -2 2} => {-1 -2 1 3 2}
*/
public class P_0330SpecialSort {
	public static void main(String[] args) {
		int[] arr = {-1, 1, 3, -2, 2};
		int[] arr2 = new int[arr.length];
		int[] arr3 = new int[arr.length];
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				arr2[cnt] = arr[i];
				cnt++;
			}
		}
		cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				arr3[cnt] = arr[i];
				cnt++;
			}
		}
		cnt = 0;
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] == 0) {
				arr2[i] = arr3[cnt];
				cnt++;
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + "\t");
		}
	}
}