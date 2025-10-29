package programmers.lv2;

//43 크기가 작은 부분문자열
public class P013 {

	public int solution(int[][] sizes) {

		int answer = 0;
		int length = 0;
		int height = 0;

		for(int[] array : sizes) {

			length = Math.max(length, Math.max(array[0],array[1]));
			height = Math.max(height, Math.min(array[0],array[1]));

		}

		answer = length * height;

		return answer;
	}

	public static void main(String[] args) {
		P013 sol = new P013();

		int result = sol.solution(new int[][]{{60, 50},{30, 70}, {60, 30}, {80, 40}});

		System.out.println("결과: " + result);
	}
}
