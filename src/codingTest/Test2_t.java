package codingTest;

import java.util.Scanner;

public class Test2_t {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String answer = solution(word);
        String answer2 = solution2(word);
        System.out.println(answer);
        System.out.println(answer2);
    }

    private static String solution2(String word) {
        String temp = "";
        for(char x : word.toCharArray()) {
            if(x>=97 && x<=122) {
                temp += (char)(x-32);
            } else {
                temp += (char)(x+32);
            }
        }
        return temp;
    }

    private static String solution(String word) {
        String temp = "";
        for(char x : word.toCharArray()) {
            if(Character.isLowerCase(x)) {
                temp += Character.toUpperCase(x);
            } else {
                temp += Character.toLowerCase(x);
            }
        }
        return temp;
    }
}
