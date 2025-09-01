package programmers.lv1;

public class P020 {
	//26 음양 더하기

	public int solution(int[] absolutes, boolean[] signs) {

		int answer =0;

		for(int i=0; i<absolutes.length; i++) {
			if(!signs[i]) {
				absolutes[i]*=-1;
			}

			answer+=absolutes[i];
		}

		return  answer;
	}

	public static void main(String[] args) {
		P020 sol = new P020();

		int result = sol.solution(new int[] {4,7,12},new boolean[] {true, false, true});

		System.out.println("결과: " + result);
	}
}
