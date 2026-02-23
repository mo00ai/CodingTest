package newbaekjoon.lv0.part2;

import java.util.Scanner;

public class P2577 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int d = sc.nextInt() * sc.nextInt() * sc.nextInt();
		String result = String.valueOf(d);
		int count = 0;

		for(int i=0; i<result.length(); i++) {
			if(result.charAt(i)=='0') {
				count++;
			}
		}

		System.out.println(count);


		for(int i=1; i<=9; i++) {
			int count1 = 0;
			for(int j=0; j<result.length(); j++) {
				if(result.charAt(j) - '0' == i) {
					count1++;
				}
			}
			System.out.println(count1);
		}

	}

}
