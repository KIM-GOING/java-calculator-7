package calculator;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words;
        char custom;

        // 문자열 입력
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        words = sc.next();

        // 커스텀 구분자 확인
        if(words.charAt(0)=='/' && words.charAt(1)=='/' && words.charAt(3)=='\\' && words.charAt(4)=='n') {
            custom = words.charAt(2);
        }

    }
}
