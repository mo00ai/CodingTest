package programmers.lv3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//48 k번째 수
public class P003 {

	public int[] solution(int[] array, int[][] commends) {

		int[] answer = new int[commends.length];

		for(int i=0; i<commends.length; i++) {

			int[] copiedArray = Arrays.copyOfRange(array,  commends[i][0]-1, commends[i][1]);

			Arrays.sort(copiedArray);

			answer[i] = copiedArray[commends[i][2]-1];

		}

		return answer;
	}

	public static void main(String[] args) {
		P003 sol = new P003();

		int[] result = sol.solution(new int[] {1, 5, 2, 6, 3, 7, 4}, new int[][] {{2, 5, 3},{4, 4, 1},{1, 7, 3}} );

		System.out.println("결과: " + Arrays.toString(result));
	}
}
