package programmers.lv3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//47 문자열 내 마음대로 정렬하기
public class P002 {

	public String[] solution(String[] strings, int n) {

		List<String> array = new ArrayList<>();

		for(int i=0; i< strings.length; i++) {
			array.add(strings[i].charAt(n)+strings[i]);
		}

		Collections.sort(array);

		String[] stringArray = array.toArray(new String[array.size()]);

		for(int i=0; i<array.size(); i++) {
			stringArray[i] = array.get(i).substring(1);
		}

		return stringArray;

	}

	public static void main(String[] args) {
		P002 sol = new P002();

		String[] result = sol.solution(new String[] {"sun", "bed", "car"}, 1);

		System.out.println("결과: " + Arrays.toString(result));
	}
}
