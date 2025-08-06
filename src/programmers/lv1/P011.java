package programmers.lv1;


public class P011 {

	public int[] solution(long n) {
		String str = String.valueOf(n);
		int[] answer = new int[str.length()];

		System.out.println(str.length());


		for(int i = 0; i < str.length(); i++) {
			answer[i] = Integer.parseInt(str.substring(str.length() - (1 + i), str.length() - i));
		}

		return answer;
	}
}


