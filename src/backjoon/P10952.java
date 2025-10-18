package backjoon;

import java.util.Scanner;

public class P10952 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int firstNum = 0;
		int secondNum = 0;

		while(true) {

			firstNum = sc.nextInt();
			secondNum = sc.nextInt();

			if(firstNum==0&&secondNum==0) {
				break;
			}

			System.out.println(firstNum + secondNum);

		}


		sc.close();
	}

}
