package programmers.lv2;

//40 이상한 문자 만들기
public class P010 {

	public String solution(String s) {

		String answer = "";
		StringBuilder sb = new StringBuilder();
		int index = 0;

		for(int i=0; i<s.length(); i++) {

			// if(s.charAt(i) == ' ') {
			// 	System.out.print(" ");
			// 	index++;
			// 	i += index;
			// }

			if (s.charAt(i) == ' ') {
				sb.append(' ');
				index = 0; // 단어가 끝났으므로 인덱스 초기화
				continue;
			}


			if((index)%2==0 ) {
				sb.append(Character.toUpperCase(s.charAt(i)));
			} else {
				sb.append(Character.toLowerCase(s.charAt(i)));
			}

			index++;
		}


		return sb.toString();
	}

	public static void main(String[] args) {
		P010 sol = new P010();

		String result = sol.solution("try hello world");

		System.out.println("결과: " + result);
	}
}
