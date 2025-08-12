package programmers.lv1;

public class P013 {

	public long solution(long n) {
		long answer = 0;

		for(long i=0; i*i<=n ; i++) {
			if(i*i == n) {
				answer = (i + 1) *(i+1);
			} else {
				answer = -1;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		P013 sol = new P013();

		long input = 121;
		long result = sol.solution(input);

		System.out.println("결과: " + result);
	}
}
