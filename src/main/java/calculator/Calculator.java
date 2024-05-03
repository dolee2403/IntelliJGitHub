package calculator;

import java.util.ArrayList;

public class Calculator {
    private  ArrayList<Integer> results;
    /* 연산 결과를 저장하는 컬렉션 타입 필드가 생성자를 통해 초기화 되도록 변경 */
    public Calculator(ArrayList<Integer> results) {
        this.results = results;
    }

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
                    throw new Exception("0으로 나눌 수 없음");
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

    // Getter 메서드 구현
    public ArrayList<Integer> getResults() {
        return results;
    }

    // Setter 메서드 구현
    public void setResults(ArrayList<Integer> results) {
        this.results = results;
    }

    // 결과를 컬렉션에서 제거하는 메서드
    public void removeResult(int index) {
        this.results.remove(index);  // 연산 결과를 제거
    }

    public void inquiryResults() {
        System.out.println("모든 연산 결과:");
        for (int i = 0; i < results.size(); i++) {
            System.out.println(results.get(i));
        }
        System.out.println("최종 연산 결과: " + results.size());
    }

}
