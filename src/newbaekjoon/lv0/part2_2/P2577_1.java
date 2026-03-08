package newbaekjoon.lv0.part2_2;

import java.util.Scanner;

public class P2577_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num =1;

		for(int i=0; i<3; i++)	 {
			num *= sc.nextInt();
		}

		String str = String.valueOf(num);

		for(int i=0; i<10; i++) {
			int count = 0;

			for(int j=0; j<str.length(); j++) {
				if(str.charAt(j)-'0'==i) {
					count++;
				}
			}

			System.out.println(count);

		}



	}

}
