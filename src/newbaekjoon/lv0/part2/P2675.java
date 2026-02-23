package newbaekjoon.lv0.part2;

import java.util.Scanner;

public class P2675 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s = "alphanumeric";
		int num = sc.nextInt();

		for(int i=0; i<num; i++) {
			StringBuilder sb = new StringBuilder();

			int times = sc.nextInt();
			String word = sc.next();

			for(int j=0; j<word.length(); j++) {
				for(int k=0; k<times; k++) {
					sb.append(word.charAt(j));
				}
			}

			System.out.println(sb.toString());

		}


	}

}
