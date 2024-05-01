package calculator;

import java.util.ArrayList;

public class Calculator {
    private int result;
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    private ArrayList<Integer> intList = new ArrayList<Integer>(); // 선언 및 생성

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
        this.result = result; // 연산 결과를 result 필드에 저장
        intList.add(result); // 계산 결과를 컬렉션에 추가
        return result;
    }

    // Getter 메서드 구현
    public int getResult() {
        return result;
    }

    // Setter 메서드 구현
    public void setResult(int result) {
        this.result = result;
    }

    // 결과를 컬렉션에서 제거하는 메서드
    public void removeResult() {
        intList.clear(); // 결과를 저장한 컬렉션을 비움
        this.result = 0; // 연산 결과를 초기화
    }
}
