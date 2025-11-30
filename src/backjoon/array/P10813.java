package backjoon.array;

import java.util.Scanner;

public class P10813 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] basket = new int[N];

		for (int index = 0; index < N; index++) {
			basket[index] = index + 1;
		}

		for (int i = 0; i < M; i++) {
			int j = sc.nextInt();
			int k = sc.nextInt();

			int temp = basket[j - 1];
			basket[j - 1] = basket[k - 1];
			basket[k - 1] = temp;
		}

		for (int each : basket) {
			System.out.print(each + " ");
		}
	}

}
