package newbaekjoon.lv1.part1;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P1021 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[m];

		for(int i=0;i<m; i++) {
			arr[i] = sc.nextInt();
		}

		int count = 0;
		Deque<Integer> queue = new LinkedList<>();

		for(int i=1; i<=n; i++) {
			queue.offerLast(i);
		}

		for(int t : arr) {

			//if t = 2 -> 0
			//

			int index = 0;

			for(int num : queue) {
				if(num==t) {
					break;
				}
				index++;
			}

			int left = index;
			int right = queue.size() - index;

			if(left <= right) {
				for (int i=0; i<left; i++) {
					queue.offerLast(queue.pollFirst());
					count++;
				}
			} else {
				for (int i=0; i<right; i++) {
					queue.offerFirst(queue.pollLast());
					count++;
				}
			}

			queue.pollFirst();

		}

		System.out.println(count);

	}

}
