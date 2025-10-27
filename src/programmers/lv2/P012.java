package programmers.lv2;

//43 크기가 작은 부분문자열
public class P012 {

	public int solution(String t, String p) {

		int answer = 0;


		for(int i=0; i<t.length(); i++) {

			if(i>t.length() - p.length()) {
				break;
			}

			String word = t.substring(i, i + p.length());

			if(Integer.parseInt(word) <= Integer.parseInt(p)) {
				answer++;
			}

		}

		return answer;
	}

	public static void main(String[] args) {
		P012 sol = new P012();

		int result = sol.solution("3141592", "271");

		System.out.println("결과: " + result);
	}
}
