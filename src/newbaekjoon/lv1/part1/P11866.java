package newbaekjoon.lv1.part1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P11866 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		Queue<Integer> queue = new LinkedList<>();
		StringBuilder sb = new StringBuilder();

		sb.append("<");

		for(int i=1; i<=n; i++) {
			queue.offer(i);
		}

		while(!queue.isEmpty()) {

			for(int i=0; i<k-1;i++){
				Integer num = queue.poll();
				queue.offer(num);
			}

			sb.append(queue.poll());

			if(!queue.isEmpty()) {
				sb.append(", ");
			}

		}

		sb.append(">");
		System.out.println(sb);

	}

}
