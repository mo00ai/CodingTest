package backjoon;

import java.util.Scanner;

public class P10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int min = sc.nextInt();
		int max = min;

		for (int i = 0; i < num-1; i++) {
			int input = sc.nextInt();

			if (input < min)  {
				min = input;
			}

			if (input > max)  {
				max = input;
			}
		}

		System.out.println(min + " " + max);
	}

}
