package newbaekjoon.lv1.part1_2;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class P10773 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Stack<Integer> stack = new Stack<>();

		int k = sc.nextInt();

		for(int i=0; i<k; i++) {

			int n = sc.nextInt();

			if(n!=0) {
				stack.add(n);
			} else {
				if(!stack.isEmpty()) {
					stack.pop();
				}
			}
		}

		int sum = stack.stream().mapToInt(Integer::intValue).sum();

		System.out.println(sum);


	}

}
