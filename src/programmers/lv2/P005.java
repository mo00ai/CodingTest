package programmers.lv2;

import java.util.Arrays;

//35 부족한 금액 계산하기
public class P005 {

	public long solution(int price, int money, int count) {

		long answer = 0;

		for(int i=1; i<=count; i++) {
			answer += price*i;
		}

		if(answer < money) {
			return 0;
		}

		return answer - money;
	}

	public static void main(String[] args) {
		P005 sol = new P005();

		long result = sol.solution(3,20,4);

		System.out.println("결과: " + result);
	}
}
