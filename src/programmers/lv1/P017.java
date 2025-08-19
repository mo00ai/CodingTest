package programmers.lv1;

public class P017 {
	//23 콜라츠 추측

	public int solution(int num) {
		long n = num;
		int count = 0;

		while(count<500) {
			if(n%2==0) {
				n /= 2;
				count++;
			} else {
				if(n==1) {
					break;
				}
				n *= 3;
				n += 1;
				count++;
			}
		}

		if(count<500) {
			return count;
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		P017 sol = new P017();

		long result = sol.solution(6);

		System.out.println("결과: " + result);
	}
}
