package programmers.lv1;

//27 핸드폰 번호 가리기
public class P021 {

	public String solution(String phone_number) {

		String result = "";

		for(int i=0; i<phone_number.length()-4; i++) {
			result += "*";
		}

		return result + phone_number.substring(phone_number.length()-4);

	}

	public static void main(String[] args) {
		P021 sol = new P021();

		String result = sol.solution("01033334444");

		System.out.println("결과: " + result);
	}
}
