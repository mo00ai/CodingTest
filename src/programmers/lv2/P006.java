package programmers.lv2;

//36
public class P006 {

	public boolean solution(String s) {

		boolean answer = false;

		for(int i=0; i<s.length(); i++) {
			if(!(s.charAt(i)>=48 && s.charAt(i)<=57)) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		P006 sol = new P006();

		boolean result = sol.solution("123");

		System.out.println("결과: " + result);
	}
}
