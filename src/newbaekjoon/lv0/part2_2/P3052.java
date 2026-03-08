package newbaekjoon.lv0.part2_2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P3052 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();

		for(int i =0; i<10; i++) {
			int num = sc.nextInt() % 42;
			set.add(num);
		}

		System.out.println(set.size());

	}

}
