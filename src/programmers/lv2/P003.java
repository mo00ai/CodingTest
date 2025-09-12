package programmers.lv2;

//33 약수의 개수와 덧셈
public class P003 {

	public int solution(int left, int right) {

		int answer = 0;


		for(int i=left; i<=right; i++) {

			int divisor = 0;

			for(int j=1; j<=i; j++) {

				if(i%j==0) {
					divisor++;
				}
			}

			if(divisor%2==0) {
				answer += i;
			} else {
				answer -= i;
			}

		}

		return answer;
	}

	public static void main(String[] args) {
		P003 sol = new P003();

		int result = sol.solution(13,17);

		System.out.println("결과: " + result);
	}
}
