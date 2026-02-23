package newbaekjoon.lv1.part2;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class P10816 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Map<Integer, Integer> map = new HashMap<>();
		StringBuilder sb = new StringBuilder();

		int n = sc.nextInt();

		for(int i=0; i<n; i++) {
			int num = sc.nextInt();
			map.put(num,map.getOrDefault(num,0)+1);
		}

		int m = sc.nextInt();

		for(int i=0; i<m; i++) {
			sb.append(map.getOrDefault(sc.nextInt(),0));

			if(i != m-1) {
				sb.append(" ");
			}
		}

		System.out.println(sb);

	}

}
