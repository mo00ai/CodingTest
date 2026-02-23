package newbaekjoon.lv1.part1;

import java.util.Scanner;
import java.util.Stack;

public class P4949 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true) {
			String s = sc.nextLine();

			if(s.equals(".")) {
				break;
			}

			Stack<Character> stack = new Stack<>();
			boolean isValid = true;

			for(int i=0; i<s.length(); i++) {
				char c = s.charAt(i);

				if(c == '(' || c== '[') {
					stack.push(c);
				} else if(c == ')') {
					if(stack.isEmpty() || stack.peek() != '(') {
						isValid = false;
						break;
					}
					stack.pop();
				} else if(c == ']') {
					if(stack.isEmpty() || stack.peek() != '[') {
						isValid = false;
						break;
					}
					stack.pop();
				}

			}

			if(!stack.isEmpty()) {
				isValid = false;
			}

			System.out.println(isValid ? "yes" : "no");

		}

	}

}
