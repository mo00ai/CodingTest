package newbaekjoon.lv1.part3;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class P11286 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) -> {
				if (Math.abs(a) == Math.abs(b)) {
					return a-b;
				}
				return Math.abs(a) - Math.abs(b);
		}
			);
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<n; i++) {

			int x = sc.nextInt();

			if(x != 0) {
				queue.add(x);
			} else if(x==0) {
				if(queue.isEmpty()) {
					sb.append(0).append("\n");
				} else {
					sb.append(queue.poll()).append("\n");
				}

			}

		}

		System.out.println(sb);

	}
}
