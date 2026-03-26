package newbaekjoon.lv1.part1_2;

import java.util.Scanner;
import java.util.Stack;

public class P9012 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Stack<Integer> stack = new Stack<>();

		int k = sc.nextInt();

		for(int i=0; i<k; i++) {
			String str = sc.next();
			boolean isValid = true;
			int count = 0;

			for(int j=0; j<str.length(); j++) {

				char c = str.charAt(j);

				if(c=='(') {
					count++;
				} else {
					count--;
				}

				if(count <0) {
					isValid = false;
					break;
				}

			}

			if(count != 0) {
				isValid = false;
			}

			if(isValid) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}


	}

}
