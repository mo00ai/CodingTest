package newbaekjoon.lv1.part1;

import java.util.Scanner;
import java.util.Stack;

public class P9012 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();
		sc.nextLine();
		Stack<String> arr = new Stack<>();

		for(int i=0; i<k; i++) {
			String s = sc.nextLine();
			int count = 0;
			boolean isValid = true;

			for(int j=0; j<s.length(); j++) {
				if(s.charAt(j)=='(') {
					count++;
				} else {
					count--;
				}

				if(count<0) {
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
