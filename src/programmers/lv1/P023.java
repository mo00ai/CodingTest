package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//29 제일 작은 수 제거하기
public class P023 {

	public int[] solution(int[] arr) {

		//최소값 찾고
		int minNum = Arrays.stream(arr).min().getAsInt();

		//결과 배열 초기화
		int[] result = new int[arr.length-1];

		//최소값 빼서 새 배열 만들어서 복사
		//근데 배열의 길이가 1일때도 고려 -> if 나눔
		int index = 0 ;

		if(arr.length==1) {
			return new int[] {-1};
		} else {
			for(int num : arr) {
				if(num != minNum) {
					result[index++] = num;
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		P023 sol = new P023();

		int[] result = sol.solution(new int[] {4,3,2,1});

		System.out.println("결과: " + Arrays.toString(result));
	}
}
