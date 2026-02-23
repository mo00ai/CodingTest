package newbaekjoon.lv0.part2;

import java.util.Scanner;

public class P1546 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int subject = sc.nextInt();
		int max = 0;
		double sum =0;


		for(int i=0; i<subject; i++) {
			int score = sc.nextInt();
			sum += score;
			if(score > max) {
				max = score;
			}
		}

		System.out.println((sum/max*100)/subject);

	}

}
