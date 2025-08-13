package programmers.lv1;

import java.util.Arrays;
import java.util.Collections;

public class P015 {

	public boolean solution(int n) {
		boolean answer = false;

		String str = String.valueOf(n);
		// int[] intArry = new int[str.length()];
		StringBuilder sb = new StringBuilder();
		int sum = 0;

		for(int i=0; i<str.length(); i++) {
			// intArry[i] = str.charAt(i)-'0';
			sum += str.charAt(i)-'0';
		}


		if(n%sum == 0) {
			answer = true;
		}

		return answer;
	}

	public static void main(String[] args) {
		P015 sol = new P015();

		int input = 10;
		boolean result = sol.solution(input);

		System.out.println("결과: " + result);
	}
}
