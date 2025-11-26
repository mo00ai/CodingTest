package programmers.lv3;

import java.util.Arrays;

//51 푸드 파이트 대회
public class P006 {

	public String solution(int[] food) {

		String answer = "";

		StringBuilder sb = new StringBuilder();

		for(int i=1; i< food.length; i++) {

			int num = food[i];

			int n = 0;
			while(n < num/2) {
				sb.append(i);
				n++;
			}

		}

		StringBuilder sb2 = new StringBuilder();
		sb2.append(sb.toString());
		sb2.reverse();

		sb.append("0");
		sb.append(sb2.toString());
		return sb.toString();

	}

	public static void main(String[] args) {
		P006 sol = new P006();

		String result = sol.solution(new int[] {1,3,4,6});

		System.out.println("결과: " + result);
	}
}
