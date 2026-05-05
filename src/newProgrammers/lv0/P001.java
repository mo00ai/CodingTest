package newProgrammers.lv0;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import programmers.lv1.P016;

public class P001 {
	public int[] solution(int[] numbers) {
		//두 개 뽑아서 더하기

		Set<Integer> set = new HashSet<>();

		for(int i=0; i<numbers.length; i++) {

			if(i == numbers.length-1) {
				break;
			}

			for(int j=i+1; j<numbers.length; j++) {
				set.add(numbers[i]+ numbers[j]);
			}
		}

		return set.stream().sorted().mapToInt(Integer::intValue).toArray();
	}

	public static void main(String[] args) {
		P001 sol = new P001();

		int[] result = sol.solution(new int[] {2,1,3,4,1});

		System.out.println(Arrays.toString(result));
	}
}
