package newbaekjoon.lv0.part2_2;

import java.util.Scanner;

public class P8958 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();

		for(int i=0; i<m; i++) {
			String str = sc.next();

			int n = 0;
			int sum = 0;
			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j)=='O') {
					n++;
					sum += n;
				} else {
					n=0;
				}
			}

			System.out.println(sum);

		}

	}

}
