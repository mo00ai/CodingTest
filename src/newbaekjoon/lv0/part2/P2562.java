package newbaekjoon.lv0.part2;

import java.util.Arrays;
import java.util.Scanner;

public class P2562 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int max = 0;
		int count =0;
		int index = 0;

		for(int i=0; i<9; i++) {
			arr[i] = sc.nextInt();
		}

		for(int value : arr) {
			count++;
			if(value > max) {
				max = value;
				index = count;
			}
		}

		System.out.println(max + " " + index);

	}

	public void solution() {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];



	}


}
