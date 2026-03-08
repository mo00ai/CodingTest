package newbaekjoon.lv0.part2_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P10818_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for(int i=0; i<n; i++) {

			int num = sc.nextInt();

			min = Math.min(num, min);
			max = Math.max(num, max);

		}

		System.out.println(min + " " + max);



	}



}
