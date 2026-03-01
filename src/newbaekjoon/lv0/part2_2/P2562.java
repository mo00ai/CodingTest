package newbaekjoon.lv0.part2_2;

import java.util.Scanner;

public class P2562 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[9];
		int max = 0;
		int index = 1;

		for(int i=0; i<9; i++) {

			arr[i] = sc.nextInt();

			if(arr[i] > max) {
				max = arr[i];
				index = i;
			}

		}

		System.out.println(max);
		System.out.println(index+1);


	}

}
