package programmers.lv1;

public class P004 {

	public String solution(int num) {

		String answer = "";

		if(num%2==0) {
			answer = "Even";
		} else {
			answer = "Odd";
		}
		return answer;
	}
}
