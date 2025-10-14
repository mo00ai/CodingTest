package backjoon;

import java.util.Scanner;

public class P11022 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();

		for (int i = 1; i <= count; i++) {
			int firstNum = sc.nextInt();
			int secondNum = sc.nextInt();
			System.out.println("Case #" + i + ": "
				+ firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
		}

		sc.close();
	}

}
