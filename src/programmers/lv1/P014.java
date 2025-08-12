package programmers.lv1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import com.sun.jdi.LongValue;

public class P014 {

	public long solution(long n) {
		long answer = 0;

		String[] strArray = String.valueOf(n).split("");

		Arrays.sort(strArray, Collections.reverseOrder());

		StringBuilder sb = new StringBuilder();
		for(String s : strArray) {
			sb.append(s);
		}

		return Long.parseLong(sb.toString());
	}

	public static void main(String[] args) {
		P014 sol = new P014();

		int input = 10;
		long result = sol.solution(input);

		System.out.println("결과: " + result);
	}
}
