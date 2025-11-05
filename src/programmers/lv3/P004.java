package programmers.lv3;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

//49 두 개 뽑아서 더하기
public class P004 {

	public int[] solution(int[] numbers) {

		Set<Integer> array = new HashSet<>();

		for(int i=0; i< numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				array.add(numbers[i] + numbers[j]);
			}
		}

		return array.stream().sorted().mapToInt(Integer::intValue).toArray();
	}

	public static void main(String[] args) {
		P004 sol = new P004();

		int[] result = sol.solution(new int[] {2,1,3,4,1});

		System.out.println("결과: " + Arrays.toString(result));
	}
}
