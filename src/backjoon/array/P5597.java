package backjoon.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P5597 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean[] inputArray = new boolean[31];

		for(int i=0; i<28; i++) {
			int num = sc.nextInt();
			inputArray[num] = true;
		}

		for(int i=1; i<=30; i++) {
			if(!inputArray[i]) {
				System.out.println(i);
			}
		}

	}

}
