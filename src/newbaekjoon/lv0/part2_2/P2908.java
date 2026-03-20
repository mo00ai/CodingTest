package newbaekjoon.lv0.part2_2;

import java.util.Scanner;

public class P2908 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String a= sc.next();
		String b= sc.next();

		String ra = new StringBuilder(a).reverse().toString();
		String rb = new StringBuilder(b).reverse().toString();

		int A = Integer.parseInt(a);
		int B = Integer.parseInt(b);

		System.out.println(Math.max(A,B));

	}

}
