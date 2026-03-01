package newbaekjoon.lv1.part2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class P14425 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		//set으로 풀어야하는 문제
		//존재 여부 set (type 상관없이 걍 교집합 count++ etc)
		//빈도 계산 map (각 type마다 갯수)

		HashSet<String> set = new HashSet<>();

		for(int i=0; i<n; i++) {
			String input = sc.next();
			set.add(input);
		}

		int count =0;

		for(int i=0; i<m; i++) {
			String input = sc.next();
			if(set.contains(input)) {
				count++;
			}
		}

		System.out.println(count);


	}

}
