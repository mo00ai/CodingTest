package newProgrammers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class P003 {
	public int[] solution(int[] answer) {
		//k번째수

		int[] a = {1, 2, 3, 4, 5};
		int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		int[] score = new int[3];

		for(int i=0; i< answer.length; i++) {
			if(answer[i] == a[i%a.length]) score[0]++;
			if(answer[i] == b[i%b.length]) score[1]++;
			if(answer[i] == c[i%c.length]) score[2]++;
		}

		int maxScore = Math.max(score[0], Math.max(score[1], score[2]));

		List<Integer> list = new ArrayList<>();

		for(int i=0; i<score.length; i++) {
			if(maxScore == score[i]) {
				list.add(i+1);
			}
		}

		return list.stream().mapToInt(Integer::intValue).toArray();
	}

	public static void main(String[] args) {
		P003 sol = new P003();

		int[] result = sol.solution(new int[] {1,2,3,4,5});

		System.out.println(Arrays.toString(result));
	}
}
