package newbaekjoon.lv1.part1;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P1966 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int t= sc.nextInt();

		for(int i=0; i<t; i++) {

			int n = sc.nextInt();
			int m = sc.nextInt();
			int count= 0;
			Queue<int[]> queue = new LinkedList<>();

			for(int j=0; j<n; j++) {
				queue.offer(new int[]{sc.nextInt(), j});
			}

			while(!queue.isEmpty()) {

				int[] target = queue.poll();
				boolean hasHigher = false;

				for(int[] element : queue) {

					if(element[0] > target[0]) {
						hasHigher = true;
						break;
					}
				}

				if(hasHigher) {
					queue.offer(target);
				} else {
					count++;
					if(target[1]==m) {
						System.out.println(count);
						break;
					}

				}

			}

		}

	}

}
