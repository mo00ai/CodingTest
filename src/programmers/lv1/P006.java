package programmers.lv1;

public class P006 {

	public int solution(int n) {
		int answer = 0;

		String temp = Integer.toString(n);

		for(int i=0; i<temp.length(); i++) {
			answer += Integer.parseInt(temp.charAt(i) + "");
		}

		return answer;
	}
}
