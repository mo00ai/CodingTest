package newbaekjoon.lv1.part2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class P16200 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<String> set = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		List<String> list = new ArrayList<>();

		int n = sc.nextInt();
		int m = sc.nextInt();

		for(int i=0; i<n; i++) {
			set.add(sc.next());
		}

		for(int i=0; i<m; i++) {
			String name = sc.next();
			if(set.contains(name)) {
				list.add(name);
			};
		}

		System.out.println(list.size());

		// list.stream().sorted().forEach(System.out::println);

		Collections.sort(list);

		for(String s : list) {
			System.out.println(s);
		}


	}

}
