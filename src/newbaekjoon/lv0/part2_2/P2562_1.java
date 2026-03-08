package newbaekjoon.lv0.part2_2;

import java.util.Scanner;

public class P2562_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int max = 0;
		int index = 0;


		for (int i=0; i<9; i++) {

			int num = sc.nextInt();

			if(max < num) {
				max = num;
				index=i+1;
			}

		}

		System.out.println(max);
		System.out.println(index);


	}

}
