package newbaekjoon.lv0.part2;

import java.util.Scanner;

public class P8958 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();


		for(int i=0; i<index; i++) {
			int count =0;
			int sum =0;
			String line = sc.next();

			for(int j=0; j<line.length(); j++) {
				if(line.charAt(j)=='O') {
					count++;
					sum += count;
				} else {
					count=0;
				}
			}
			System.out.println(sum);
		}



	}

}
