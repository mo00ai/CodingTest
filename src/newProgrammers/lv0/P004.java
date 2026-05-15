package newProgrammers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P004 {
	public int solution(int n, int[] lost, int[] reserve) {
		//k번째수
		//뭔가 불리언 배열을 사용해야할 거 같은 느낌스

		int[] arr = new int[n];
		int answer = 0;

		//모두 1로
		Arrays.fill(arr, 1);

		for(int l : lost) arr[l-1]--;
		for(int r : reserve) arr[r-1]++;

		for(int i=0; i<n; i++) {

			if(arr[i] == 0) {
				if(i > 0 && arr[i-1] == 2) {
					arr[i]++;
					arr[i-1]--;
				} else if(i < n-1 && arr[i+1] == 2) {
					arr[i]++;
					arr[i+1]--;
				}
			}
		}

		for (int num : arr) {
			// if(c>=)
		}



		return answer;
	}

	public static void main(String[] args) {
		P004 sol = new P004();

		int result = sol.solution(5,new int[] {2,4}, new int[] {1,3,5});

		System.out.println(result);
	}
}
