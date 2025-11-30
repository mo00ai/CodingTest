package backjoon.beforearray;

import java.util.Scanner;

public class P10807 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count = sc.nextInt();
		int[] arr = new int[count];

		for (int i = 0; i < count; i++) {
			arr[i] = sc.nextInt();
		}

		int findingNum = sc.nextInt();
		int result = 0;

		for (int num : arr) {
			if (num == findingNum) {
				result++;
			}
		}

		System.out.println(result);
	}

}
