package newbaekjoon.lv1.part2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class P9375 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for(int i=0; i<n; i++) {
			int count = 0;
			int m = sc.nextInt();
			sc.nextLine();

			Map<String, List<String>> map = new HashMap<>();

			for(int j=0; j<m; j++) {

				String input = sc.nextLine();
				String[] arr = input.split(" ");

				map.putIfAbsent(arr[1], new ArrayList<>());
				map.get(arr[1]).add(arr[0]);

			}

			int result = 1;
			for(List<String> list : map.values()) {
				result *= (list.size()+1);
			}

			System.out.println(result-1);

		}

	}

}
