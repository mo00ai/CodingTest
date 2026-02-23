package newbaekjoon.lv0.part1;

import java.util.Scanner;

public class P8393 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		for(int j=0; j<num; j++) {
			for(int i=0; i<=j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}


	}
}
