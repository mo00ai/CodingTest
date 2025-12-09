package backjoon.array;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P3052 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Set<Integer> array = new HashSet<>();

		for (int i = 0; i < 10; i++) {
			int num = sc.nextInt();
			array.add(num % 42);
		}

		System.out.println(array.size());
	}

}
