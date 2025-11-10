package programmers.lv3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//50 가장 가까운 같은 글자
public class P005 {

	public int[] solution(String s) {

		int[] answer = new int[s.length()];
		int index = 0;

		for (int i=0; i<s.length(); i++) {

			answer[i] = -1;

			for(int j=i-1;j>=0;j--) {

				if(s.charAt(i)==s.charAt(j)) {
					index = i-j;
					answer[i]=index;
					break; //가장 가까운 숫자 찾으면 종료
				}
			}

		}
		return answer;

	}

	public static void main(String[] args) {
		P005 sol = new P005();

		int[] result = sol.solution("banana");

		System.out.println("결과: " + Arrays.toString(result));
	}
}
