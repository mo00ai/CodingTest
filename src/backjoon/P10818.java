package backjoon;

import java.util.Scanner;

public class P10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int min = 0;
		int max = 0;

		for (int i = 1; i < num; i++) {
			int input = sc.nextInt();

			if (input < min)  {
				min = num;
			}

			if (input > max)  {
				max = num;
			}
		}

		System.out.println(min + " " + max);
	}

}
