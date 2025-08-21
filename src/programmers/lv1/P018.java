package programmers.lv1;

public class P018 {
	//24 서울에서 김서방 찾기

	public String solution(String[] seoul) {
		String answer = "";
		int x = 0;

		for(int i = 0; i < seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				x = i;
				break;
			}
		}

		return "김서방은 " + x + "에 있다";
	}

	public static void main(String[] args) {
		P018 sol = new P018();

		String result = sol.solution(new String[] {"Jane", "Kim"});

		System.out.println("결과: " + result);
	}
}
