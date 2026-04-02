package newbaekjoon.lv2.part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class P1181 {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();

		Set<String> set = new HashSet<>();

		for(int i=0; i<n; i++) {
			set.add(sc.next());
		}

		List<String> list = new ArrayList<>(set);

		list.sort((a,b) -> {
			if (a.length()==b.length()) {
				return a.compareTo(b);
			}
			return a.length() - b.length();
		});



		for(String s : list) {
			sb.append(s).append("\n");
		}

		System.out.println(sb);

	}

}
