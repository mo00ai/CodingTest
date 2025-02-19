package codingTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
//        대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
//
//
//        첫 줄에 문자열이 입력된다. 문자열의 길이는 100을 넘지 않습니다.
//
//                문자열은 영어 알파벳으로만 구성되어 있습니다.
//
//        첫 줄에 대문자는 소문자로, 소문자는 대문자로 변환된 문자열을 출력합니다.

        Scanner scanner = new Scanner(System.in);

        System.out.println("글자입력");
        String word = "";
        word = scanner.nextLine();

        ArrayList<String> answer = new ArrayList<>();




        for(int i=0; i<word.length() ; i++) {

            String temp = String.valueOf(word.charAt(i));

            if(temp==temp.toUpperCase()) {
                temp = String.valueOf(word.charAt(i)).toLowerCase();
            } else {
                temp =String.valueOf(word.charAt(i)).toUpperCase();
            }

            answer.add(temp);

        }

        String answer1 = "";

        for(int i=0;i<answer.size();i++) {
            answer1 += answer.get(i);
        }

        System.out.println(answer1);

    }

}
