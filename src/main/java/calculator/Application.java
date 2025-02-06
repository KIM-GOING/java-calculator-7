package calculator;

import java.util.Scanner;
import java.util.Vector;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> number = new Vector<>();
        String words;
        char custom;

        // 문자열 입력
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        words = sc.next();

        // 커스텀 구분자 확인
        if(words.charAt(0)=='/' && words.charAt(1)=='/' && words.charAt(3)=='\\' && words.charAt(4)=='n') {
            custom = words.charAt(2);

            // 숫자와 문자 분리
            for(int i=5; i<words.length(); i++) {
                char word = words.charAt(i);
                if(word >= 48 && word <= 57) {
                    number.add(word-48);
                }
                else if(word != custom) {
                    // 예외 처리를 위한 예비출력
                    System.out.println("예외");
                }
            }
        }
        else { // 기본 구분자의 숫자와 문자 분리
            for(int i = 0; i < words.length(); i++) {
                char word = words.charAt(i);
                if(word >= 48 && word <= 57) {
                    number.add(word-48);
                }
                else if(word != ',' && word != ':') {
                    // 예외 처리를 위한 예비출력
                    System.out.println("예외");
                }
            }
        }

        // 숫자의 합 출력
        int sum = 0;
        for(int i = 0; i < number.size(); i++) {
            sum += number.get(i);
        }
        System.out.println(sum);
    }
}
