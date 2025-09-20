package backjoon;

import java.util.Scanner;

public class P2480 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int answer = 0;
		int first = sc.nextInt();
		int second = sc.nextInt();
		int third = sc.nextInt();

		if(first == second && second == third) {
			answer = 10000 + first*1000;
		} else if (first == second || first == third) {
			answer = 1000 + first*100;
		} else if (second == third) {
			answer = 1000 + second * 100;
		} else {
			answer = Math.max(first,Math.max(second,third))*100;
		}

		System.out.println(answer);




	}
}
