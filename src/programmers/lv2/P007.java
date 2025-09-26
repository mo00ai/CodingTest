package programmers.lv2;

import java.util.Arrays;

//37 행렬의 덧셈
public class P007 {

	public int[][] solution(int[][] arr1, int[][] arr2) {

		int[][] answer = new int[arr1.length][arr2.length];

		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[0].length; j++) {
				answer [i][j] = arr1[i][j] + arr2[i][j];
			}
		}


		return answer;
	}

	public static void main(String[] args) {
		P007 sol = new P007();

		int[][] result = sol.solution(new int[][] {{1,2},{2,3}}, new int[][] {{3,4},{5,6}});

		System.out.println("결과: " + Arrays.deepToString(result));
	}
}
