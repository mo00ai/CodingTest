package newbaekjoon.lv0.part2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P3052 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];

		for(int i=0; i<10; i++) {
			int num = sc.nextInt();
			arr[i] = num % 42;
		}

		int[] distinctArr = Arrays.stream(arr).distinct().toArray();

		System.out.println(distinctArr.length);

	}

	public void solution() {
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();

		for(int i=0; i<10; i++) {
			set.add(sc.nextInt()%42);
		}

		System.out.println(set.size());

	}

	public void solution2() {

		Scanner sc = new Scanner(System.in);
		boolean[] arr = new boolean[42];
		int count=0;

		for(int i=0; i<10; i++) {
			int num = sc.nextInt()%42;

			if(!arr[num]) {
				arr[num] = true;
				count++;
			}
		}

		System.out.println(count);
		sc.close();
	}

}
