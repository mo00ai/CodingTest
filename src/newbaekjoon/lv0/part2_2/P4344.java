package newbaekjoon.lv0.part2_2;

import java.util.Scanner;

public class P4344 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int c = sc.nextInt();

		for(int i=0; i<c; i++) {
			int n = sc.nextInt();

			int sum = 0;
			int[] arr = new int[n];
			for(int j=0; j<n; j++) {

				arr[j] = sc.nextInt();
				sum += arr[j];
			}

			double average = (double) sum/n;

			double cnt = 0;
			for(int j=0; j<n; j++) {
				if(arr[j]>average) {
					cnt++;
				}
			}

			System.out.printf("%.3f%%\n", (cnt / (double)n) * 100);

		}

	}

}
