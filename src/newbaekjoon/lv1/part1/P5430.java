package newbaekjoon.lv1.part1;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class P5430 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int round = sc.nextInt();

		for(int i=0; i<round; i++) {

			String input = sc.next();
			int index = sc.nextInt();
			Deque<Integer> dq = new LinkedList<>();
			boolean isReversed = false;

			for(int j=0; j<index; j++) {
				dq.offerLast(sc.nextInt());
			}

			for(int j=0; j<input.length(); j++) {
				char c = input.charAt(j);

				if(dq.isEmpty()) {
					sb.append("error\n");
					break;
				}

				if(c=='R') {
					isReversed = !isReversed;
				}

				if(c=='D' && isReversed) {
					dq.pollLast();
				} else if(c=='D' && !isReversed) {
					dq.pollFirst();
				}

			}

			sb.append(dq.toString());


		}


	}

}
