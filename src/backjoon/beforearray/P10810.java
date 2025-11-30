package backjoon.beforearray;

import java.util.Scanner;

public class P10810 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] basket = new int[N + 1];

		for (int m = 0; m < M; m++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();

			for (int b = i; b <= j; b++) {
				basket[b] = k;
			}
		}

		for (int b = 1; b <= N; b++) {
			System.out.print(basket[b] + " ");
		}
	}
}
