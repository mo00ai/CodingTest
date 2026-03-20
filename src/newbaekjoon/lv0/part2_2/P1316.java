package newbaekjoon.lv0.part2_2;

import java.util.Locale;
import java.util.Scanner;

public class P1316 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int count=0;

		for(int i=0; i<n; i++) {
			String str = sc.next();

			boolean[] arr= new boolean[26];//이전에 나온 글자인지
			char prev = str.charAt(0);
			boolean isGroup = true;//그룹이 잘된 단어인지 체크 count를 위해

			for(int j=0; j<str.length(); j++) {
				if(prev != str.charAt(j)) {
					if(arr[str.charAt(j)-97]) {
						isGroup =false;
						break;
					}

					arr[prev-97] = true;
				}

				prev = str.charAt(j);
			}

			if(isGroup) {
				count++;
			}
		}

		System.out.println(count);

	}

}
