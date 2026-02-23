package newbaekjoon.lv0.part2;

import java.util.Scanner;

public class P4344 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();

		for(int i=0; i<index; i++) {

			int num = sc.nextInt();
			int[] arr = new int[num];
			int sum = 0;

			for(int j=0; j<num; j++) {
				arr[j] = sc.nextInt();
				sum += arr[j];
			}

			double avg = sum / num;

			double cnt = 0;

			for(int student : arr) {
				if(student > avg) {
					cnt++;
				}
			}

			System.out.printf("%.3f%%\n", 100/cnt);

		}

	}

}
