package programmers.lv2;

//31 수박수박수
public class P002 {

	public int solution(int[] a, int[] b) {

		int answer = 0;

		for(int i=0; i<a.length; i++) {
			answer += a[i]*b[i];
		}


		return answer;
	}

	public static void main(String[] args) {
		P002 sol = new P002();

		int result = sol.solution(new int[] {1,2,3,4}, new int[] {-3,-1,0,2});

		System.out.println("결과: " + result);
	}
}
