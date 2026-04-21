package newbaekjoon.lv0.part2_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P10818_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;

		for(int i=0; i<n; i++) {
			int num = sc.nextInt();
			min = Math.min(num, min);
			max = Math.max(num, min);
		}

		System.out.printf("%d %d", min, max);

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
