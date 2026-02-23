package newbaekjoon.lv0.part2;

import java.util.Scanner;

public class P10809_ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		for(int j=97; j<=122; j++) {

			char num = (char) j;

			System.out.println(str.indexOf(String.valueOf(num)));

		}

	}

	public void solution() {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		int[] pos = new int[26];

		// 1. 전부 -1로 초기화
		for (int i = 0; i < 26; i++) {
			pos[i] = -1;
		}

		// 2. 문자열 순회
		for (int i = 0; i < s.length(); i++) {
			int idx = s.charAt(i) - 'a';
			if (pos[idx] == -1) { // 처음 등장했을 때만
				pos[idx] = i;
			}
		}

		// 3. 출력
		for (int i = 0; i < 26; i++) {
			System.out.print(pos[i] + " ");
		}
	}

}
