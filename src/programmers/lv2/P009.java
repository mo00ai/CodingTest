package programmers.lv2;

import java.util.Arrays;
import java.util.Scanner;

//39 최대공약수 최소공배수
public class P009 {

	public int[] solution(int a, int b) {

		int[] answer = new int[2];

		for(int i =1; i<=Math.min(a,b); i++) {
			if(a%i==0 && b%i==0) {
				answer[0] = i;
			}
		}

		answer[1] = (a*b)/answer[0];

		return answer;
	}

	public static void main(String[] args) {
		P009 sol = new P009();

		int[] result = sol.solution(2,5);

		System.out.println("결과: " + Arrays.toString(result));
	}
}
