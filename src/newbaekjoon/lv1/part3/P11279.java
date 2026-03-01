package newbaekjoon.lv1.part3;

import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class P11279 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		PriorityQueue<Integer> queue= new PriorityQueue<>(Collections.reverseOrder());
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<n; i++) {
			int x = sc.nextInt();

			if(x>0) {
				queue.add(x);
			} else if (x==0) {
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
