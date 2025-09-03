package programmers.lv1;

public class P022 {

	public int solution(int[] numbers) {

		int sum = 0;

		for(int i=0; i<10; i++) {
			sum += i;
		}

		for(int num : numbers) {
			sum -= num;
		}

		return sum;
	}

	public static void main(String[] args) {
		P022 sol = new P022();

		int result = sol.solution(new int[] {1,2,3,4,6,7,8,0});

		System.out.println("결과: " + result);
	}
}
