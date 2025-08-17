package programmers.lv1;

public class P016 {

	//lv 1 두 정수 사이의 합

	public long solution(int a, int b) {
		long answer = 0;
		long start = Math.min(a, b);
		long end = Math.max(a, b);

		for (long i = start; i <= end; i++) {
			answer += i;
		}

		return answer;
	}

	public static void main(String[] args) {
		P016 sol = new P016();

		long result = sol.solution(3, 5);

		System.out.println("결과: " + result);
	}

}
