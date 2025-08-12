package programmers.lv1;

public class P012 {

	public int solution(String s) {
		int answer = 0;
		answer = Integer.parseInt(s);
		return answer;
	}

	public static void main(String[] args) {
		P012 sol = new P012();

		String input = "-123";
		int result = sol.solution(input);

		System.out.println("결과: " + result);
	}
}
