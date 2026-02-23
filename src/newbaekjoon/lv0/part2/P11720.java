package newbaekjoon.lv0.part2;

import java.util.Scanner;

public class P11720 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		String number = sc.next();
		int sum = 0;

		for(int j=0; j<num; j++) {
			int numb = number.charAt(j) - '0';
			sum+=numb;
		}

		System.out.println(sum);

	}

}
