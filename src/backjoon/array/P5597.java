package backjoon.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P5597 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Integer> inputList = new ArrayList<>();

		for(int i=0; i<28; i++) {
			inputList.add(sc.nextInt());
		}

		for(int i=1; i<=30; i++) {
			if(!inputList.contains(i)) {
				System.out.println(i);
			}
		}
	}

}
