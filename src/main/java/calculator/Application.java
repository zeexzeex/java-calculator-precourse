package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {

    // 문자열 덧셈 계산기 시작 함수
    public static void init() {
        System.out.println("덧셈할 문자열을 입력해주세요.");
    }

    // 문자열 입력받는 함수
    public static void input() {
       String input = Console.readLine();
    }

    public static void main(String[] args) {
        init();
        input();
    }
}
