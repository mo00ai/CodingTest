package newbaekjoon.lv0.part2_2;

import java.util.Scanner;

public class P10809 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[26];

		StringBuilder sb = new StringBuilder();

		String s = sc.next();

		for(int i=0; i<26; i++) {
			arr[i] = -1;
		}

		for(int i=0; i<s.length(); i++) {
			int index = s.charAt(i) - 'a';
			if(arr[index] == -1) {
				arr[index] = i;
			}
		}

		for(int i=0; i<26; i++) {
			if(i!=25) {
				System.out.print(arr[i] + " ");
			} else {
				System.out.print(arr[i]);
			}
		}

	}

}
