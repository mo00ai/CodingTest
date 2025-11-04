package programmers.lv3;

//46 숫자 문자열과 영단어
public class P001 {

	public int solution(String s) {

		String[] words = {"zero","one","two","three","four","five","six","seven","eight","nine"};

		for(int i=0; i< words.length; i++) {
			s = s.replaceAll(words[i], String.valueOf(i));
		}

		return Integer.parseInt(s);

	}

	public static void main(String[] args) {
		P001 sol = new P001();

		int result = sol.solution("one4seveneight");

		System.out.println("결과: " + result);
	}
}
