package newbaekjoon.lv0.part2_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P10818 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for(int i=0; i<n; i++) {
			int input = sc.nextInt();

			max = Math.max(input, max);
			min = Math.min(input, min);
		}

		System.out.println(min+ " " +max);

	}

	void solution() {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();

		for(int i=0; i<n; i++) {
			list.add(n);
		}

		Collections.sort(list);

		System.out.println(list.get(0) + " " + list.get(list.size()-1));

	}

	void solution2() {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		System.out.println(arr[0] + " "+ arr[n-1]);

	}

}
