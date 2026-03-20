package newbaekjoon.lv0.part2_2;

import java.util.Locale;
import java.util.Scanner;

public class P1157 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[26];

		StringBuilder sb = new StringBuilder();

		String s = sc.next().toUpperCase(Locale.ROOT);

		for(int i=0; i<26; i++) {
			arr[i] = 0;
		}

		for(int i=0; i<s.length(); i++) {
			int idx = s.charAt(i) - 'A';
			arr[idx]++;
		}

		int max = 0;
		int maxidx = 0;

		for(int i=0; i<26; i++) {
			if(arr[i] > 0) {
				max = arr[i];
				maxidx = i+65;
			}
		}

		int count = 0;

		for(int i=0; i<26; i++) {
			if(arr[i]==max) {
				count++;
			}
		}

		if(count > 1) {
			System.out.println("?");
		} else {
			System.out.println((char)maxidx);
		}

	}

}
