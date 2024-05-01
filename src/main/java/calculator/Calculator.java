package calculator;

import java.util.ArrayList;

public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    ArrayList<Integer> intList = new ArrayList<Integer>(); // 선언 및 생성

    public int calculate(int num1, int num2, char operator) throws Exception {
        int result = 0;

            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else if (operator == '/') {
                if(num2 == 0) {
                    throw new Exception("0으로 나눔");
                } else {
                    result = num1 / num2;
                }
            } else if (operator == '%') {
                result = num1 % num2;
            } else {
                throw new Exception("오류");
            }

        return result;
    }
}
