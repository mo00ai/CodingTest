package newbaekjoon.lv1.part1;

import java.util.Scanner;
import java.util.Stack;

public class P1874_ {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();

		//4 3 6 8 7 5 2 1

		int next = 1;

		for(int i=0; i<num; i++) {
			int target = sc.nextInt();

			// for(int j=1; j<=target; j++) {
			// 	stack.push(j);
			// 	sb.append("+\n");
			// }

			while(next <= target) {
				stack.push(next++);
				sb.append("+\n");
			}

			if(!stack.isEmpty() && stack.peek() == target) {
				stack.pop();
				sb.append("-\n");
			} else {
				System.out.println("NO");
				return;
			}

		}

		System.out.println(sb.toString());


	}

}
