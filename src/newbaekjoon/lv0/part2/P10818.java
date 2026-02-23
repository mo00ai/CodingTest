package newbaekjoon.lv0.part2;

import java.util.Arrays;
import java.util.Scanner;

public class P10818 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] array = new int[n];

		for(int i=0; i<n; i++) {
			array[i] = sc.nextInt();
		}

		Arrays.sort(array);
		System.out.println(array[0] + " " + array[n-1]);

	}

	public static void anotherWay() {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;

		for(int i=0; i<n; i++) {
			int x = sc.nextInt();

			min = Math.min(min, x);
			max = Math.max(max, x);
		}

		System.out.println(min + " " + max);

	}

}
