package newbaekjoon.lv1.part2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class P1269 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int sum = n+m;
		HashSet<Integer> set = new HashSet<>();

		for(int i=0; i<sum; i++) {
			set.add(sc.nextInt());
		}

		int inter = (sum) - set.size();

		System.out.println(sum -(inter*2));


	}

}
