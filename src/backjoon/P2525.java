package backjoon;

import java.util.Scanner;

public class P2525 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int hourNum = sc.nextInt();
		int minuteNum = sc.nextInt();
		int CookingNum = sc.nextInt();

		int total = hourNum * 60 + minuteNum + CookingNum;

		int hour = (total / 60) % 24;
		int minute = total % 60;

		System.out.println(hour + " " + minute);

	}
}
