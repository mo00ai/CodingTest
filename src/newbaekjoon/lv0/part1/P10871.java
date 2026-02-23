package newbaekjoon.lv0.part1;

import java.util.Scanner;

public class P10871 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();
		int count=0;
		int input = 0;
		StringBuilder sb = new StringBuilder();

		while(count<n) {
			input = sc.nextInt();
			if(input<x){
				sb.append(input + " ");
			}
			count++;
		}

		System.out.println(sb.toString().trim());


	}
}
