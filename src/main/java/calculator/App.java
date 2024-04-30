package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* 연산의 결과를 저장할 수 있도록 적합한 타입의 배열을 생성합니다. */
        /* 연산의 결과가 저장된 배열의 마지막 index를 저장하는 변수를 선언 */
        int[] results = new int[100]; // 예시로 크기를 100으로 설정
        int resultEnd = -1;

        /* 반복문 사용하여 연산을 반복 */
        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: "); // + - * /
            char operator = sc.next().charAt(0);
            sc.nextLine();

            int result = 0;
            /* 제어문을 사용하여 연산을 수행하고 결과를 배열에 저장 */
            if (num2 > 0) {
                if (operator == '+') {
                    result = num1 + num2;
                } else if (operator == '-') {
                    result = num1 - num2;
                } else if (operator == '*') {
                    result = num1 * num2;
                } else if (operator == '/') {
                    result = num1 / num2;
                } else if (operator == '%') {
                    result = num1 % num2;
                }

                /* 연산의 결과를 배열에 저장합니다. */
                /* index를 증가 시킵니다. */
                resultEnd++;
                results[resultEnd] = result;
            }

            /* 결과 출력 */
            System.out.println("결과: " + result);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String text = sc.nextLine();
            if (text.equals("exit")) {
                break;
            }
        }

        /* 결과 배열 출력 */
        System.out.println("모든 연산 결과:");
        for (int i = 0; i <= resultEnd; i++) {
            System.out.println(results[i]);
        }
    }
}
