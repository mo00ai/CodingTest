package newbaekjoon.lv1.part1;

import java.util.Scanner;
import java.util.Stack;

public class P10773 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int k = sc.nextInt();
		Stack<Integer> arr = new Stack<>();

		for(int i=0; i<k; i++) {
			int num = sc.nextInt();
			if(num != 0) {
				arr.push(num);
			} else {
				if(!arr.isEmpty()) {
					arr.pop();
				}
			}
		}

		System.out.println(arr.stream().mapToInt(Integer::intValue).sum());

	}

}
