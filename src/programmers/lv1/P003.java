package programmers.lv1;

public class P003 {

	public double solution(int[] numbers) {

		double answer = 0;

		for(int n : numbers) {
			answer += n;
		}

		answer /= numbers.length;

		return answer;
	}
}
