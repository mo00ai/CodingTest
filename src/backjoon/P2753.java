package backjoon;

import java.util.Scanner;


public class P2753 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int result = 0;
		int year = sc.nextInt();

		if(year%400==0 || (year%4==0 && year%100!=0)) {
			result = 1;
		}

		System.out.println(result);
	}
}
