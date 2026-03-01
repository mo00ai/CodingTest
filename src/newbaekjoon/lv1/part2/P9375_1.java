package newbaekjoon.lv1.part2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class P9375_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for(int i=0; i<n; i++) {
			int count = 0;
			int m = sc.nextInt();
			sc.nextLine();

			Map<String, Integer> map = new HashMap<>();

			for(int j=0; j<m; j++) {

				String input = sc.nextLine();
				String[] arr = input.split(" ");

				map.put(arr[1],map.getOrDefault(arr[1],0)+1);

			}

			int result = 1;
			for(int num : map.values()) {
				result *= (num+1);
			}

			System.out.println(result-1);

		}

	}

}
