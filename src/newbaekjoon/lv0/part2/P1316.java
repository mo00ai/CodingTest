package newbaekjoon.lv0.part2;

import java.util.Scanner;

public class P1316 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int count = 0;

		for(int i=0; i<num; i++) {
			String str = sc.next();
			boolean[] arr = new boolean[26];
			char prev = str.charAt(0);
			boolean isGroup = true;

			for(int j=0; j<str.length();j++) {
				if(prev != str.charAt(j)) {
					if(arr[str.charAt(j)-97]) {
						isGroup = false;
						break;
					}
					arr[prev - 97] = true;
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
