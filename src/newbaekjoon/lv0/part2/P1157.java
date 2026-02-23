package newbaekjoon.lv0.part2;

import java.util.Arrays;
import java.util.Locale;
import java.util.OptionalInt;
import java.util.Scanner;

public class P1157 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.next().toUpperCase();

		int[] arr = new int[26];

		for(int i=0; i<26; i++) {
			arr[i] = 0;
		}

		for(int j=0; j<str.length(); j++) {
			arr[str.charAt(j)-65]++;
		}

		int max = 0;
		int maxidx = 0;

		for(int i=0;  i<26; i++) {
			if(arr[i] > max) {
				max = arr[i];
				maxidx = i + 65;
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
