package calculator;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words;

        System.out.println("덧셈할 문자열을 입력해 주세요.");
        words = sc.next();
        System.out.println(words);
    }
}
