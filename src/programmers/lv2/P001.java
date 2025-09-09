package programmers.lv2;

import programmers.lv1.P024;

//31 수박수박수
public class P001 {

	public String solution(int n) {

		String result = "";
		int num = n/2;

		for(int i=0; i<num; i++) {
			result += "수박";
		}

		if(n%2!=0) {
			result += "수";
		}

		return result;
	}

	public static void main(String[] args) {
		P001 sol = new P001();

		String result = sol.solution(5);

		System.out.println("결과: " + result);
	}
}
