package programmers.lv1;

public class P025 {

	public String solution(String s) {

		String result = "";
		int middleNum = s.length()/2;

		if(s.length()%2==0) {
			result = s.substring(middleNum-1,  middleNum+1);
		} else {
			result = String.valueOf(s.charAt(middleNum));
		}


		return result;
	}

	public static void main(String[] args) {
		P024 sol = new P024();

		String result = sol.solution("abcd");

		System.out.println("결과: " + result);
	}
}
