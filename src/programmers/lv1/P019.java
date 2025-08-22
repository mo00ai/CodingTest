package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P019 {
	//25 나누어 떨어지는 숫자

	public int[] solution(int[] arr, int divisor) {
		List<Integer> list = new ArrayList<Integer>();

		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % divisor == 0) {
				list.add(arr[i]);
			}
		}

		if(list.size() == 0) {
			list.add(-1);
		}

		list.sort(Integer::compare);

		return list.stream().mapToInt(i -> i).toArray();
	}

	public static void main(String[] args) {
		P019 sol = new P019();

		int[] result = sol.solution(new int[] {5,9,7,10},5);

		System.out.println("결과: " + Arrays.toString(result));
	}
}
