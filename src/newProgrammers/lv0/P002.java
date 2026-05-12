package newProgrammers.lv0;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class P002 {
	public int[] solution(int[] array, int[][] commands) {
		//k번째수

		Scanner sc = new Scanner(System.in);

		int[] answer = new int[commands.length];

		for(int m=0; m<commands.length; m++) {

			int i = commands[m][0]-1;
			int j = commands[m][1]-1;
			int k = commands[m][2]-1;

			int[] temp = new int[j-i+1];
			int idx = 0;
			for(int n=i; n<=j; n++) {
				temp[idx] = array[n];
				idx++;
			}

			Arrays.sort(temp);

			answer[m] = temp[k];

		}

		return answer;
	}

	public static void main(String[] args) {
		P002 sol = new P002();

		int[] result = sol.solution(new int[] {1,5,2,6,3,7,4}, new int[][] {{2,5,3},{4,4,1}, {1,7,3}});

		System.out.println(Arrays.toString(result));
	}
}
