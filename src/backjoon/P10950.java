package backjoon;

import java.util.Scanner;

public class P10950 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testCase = sc.nextInt();

		for (int i = 0; i < testCase; i++) {
			int firstNum = sc.nextInt();
			int secondNum = sc.nextInt();
			System.out.println(firstNum + secondNum);
		}

		sc.close();
	}
}
