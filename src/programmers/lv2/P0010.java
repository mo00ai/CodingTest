package programmers.lv2;

import java.util.Arrays;

//39 최대공약수 최소공배수
public class P0010 {

	public String solution(String s) {

		String answer = "";
		StringBuilder sb = new StringBuilder();
		int index = 0;

		for(int i=0; i<s.length(); i++) {

			// if(s.charAt(i) == ' ') {
			// 	System.out.print(" ");
			// 	index++;
			// 	i += index;
			// }

			if (s.charAt(i) == ' ') {
				sb.append(' ');
				index = 0; // 단어가 끝났으므로 인덱스 초기화
				continue;
			}


			if((index)%2==0 ) {
				sb.append(Character.toUpperCase(s.charAt(i)));
			} else {
				sb.append(Character.toLowerCase(s.charAt(i)));
			}

			index++;
		}


		return sb.toString();
	}

	public static void main(String[] args) {
		P0010 sol = new P0010();

		String result = sol.solution("try hello world");

		System.out.println("결과: " + result);
	}
}
