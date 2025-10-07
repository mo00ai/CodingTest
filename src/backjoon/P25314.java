package backjoon;

import java.util.Scanner;

public class P25314 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();

		int count = input/4;

		for (int i=1; i<=count; i++) {
			System.out.print("long ");
		}

		System.out.print("int");

		sc.close();
	}

}
