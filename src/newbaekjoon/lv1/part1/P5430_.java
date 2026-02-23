package newbaekjoon.lv1.part1;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class P5430_ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int round = sc.nextInt();

		for(int i=0; i<round; i++) {

			String input = sc.next();
			int index = sc.nextInt();
			String arrStr = sc.next();
			Deque<Integer> dq = new LinkedList<>();
			boolean isReversed = false;
			boolean isError = false;

			arrStr = arrStr.substring(1, arrStr.length() - 1);

			if(!arrStr.isEmpty()) {
				String[] nums = arrStr.split(",");
				for(String s : nums) {
					dq.offerLast(Integer.parseInt(s));
				}
			}

			for(int j=0; j<input.length(); j++) {
				char c = input.charAt(j);

				if(c=='R') {

					isReversed = !isReversed;

				} else if(c=='D') {

					if(dq.isEmpty()) {
						isError = true;
						break;
					}

					if(isReversed) {
						dq.pollLast();
					} else {
						dq.pollFirst();
					}

				}

			}

			if(isError) {
				sb.append("error\n");
			} else  {

				int size = dq.size();

				sb.append("[");

				for(int j=0; j<size; j++) {

					sb.append(isReversed ? dq.pollLast() : dq.pollFirst());

					if(j!=size-1) {
						sb.append(",");
					}

				}

				sb.append("]\n");


			}

		}

		System.out.println(sb);

	}

}
