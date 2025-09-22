package programmers.lv2;

import java.util.Arrays;

//34 문자열 내림차순
public class P004 {

	public String solution(String s) {

		char[] charArray = s.toCharArray();

		Arrays.sort(charArray);

		StringBuilder sb = new StringBuilder(new String(charArray));

		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		P004 sol = new P004();

		String result = sol.solution("Zbcdefg");

		System.out.println("결과: " + result);
	}
}
