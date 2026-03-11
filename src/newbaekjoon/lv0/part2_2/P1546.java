package newbaekjoon.lv0.part2_2;

import java.util.Scanner;

public class P1546 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();

		double[] arr = new double[m];
		double max = 0;


		for(int i=0; i<m; i++) {
			arr[i] = sc.nextInt();

			if(max < arr[i]) {
				max = arr[i];
			}
		}

		double sum = 0;

		for(double n : arr) {
			sum += n/max*1000;
		}

		System.out.println(sum/m);

	}

}
