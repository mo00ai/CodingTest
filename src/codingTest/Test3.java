package codingTest;

import java.util.Arrays;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
//        한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
//                문장속의 각 단어는 공백으로 구분됩니다.
//
//        첫 줄에 길이가 100을 넘지 않는 한 개의 문장이 주어집니다. 문장은 영어 알파벳으로만 구성되어 있습니다.
//
//        첫 줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한 단어 출력

        Scanner scanner = new Scanner(System.in);
        String sen = scanner.nextLine();
        String[] senArray = sen.split(" ");
        String word = "";
        String max = "";


        for(int i=0; i<senArray.length; i++) {
            if(senArray[i].length() > max.length()) {

                max = senArray[i];

            }
        }


        System.out.println();
        System.out.println(max);

//        System.out.println(제일 긴단어);

    }
}
