package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* 반복문 사용 해서 연산을 반복 */
        while (true) {

        System.out.print("첫 번째 숫자를 입력하세요: ");
        // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
        int num2 = sc.nextInt();

        System.out.print("사칙연산 기호를 입력하세요: "); // + - * /
        // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
        // charAt(매개변수:idx) : charAt 메서드는 매개변수로 char 타입으로 반환 하고자하는 문자열의 위치(index)를 받는다.
        char operator = sc.next().charAt(0);
        sc.nextLine();
        System.out.println("operator = " + operator);

            int result = 0;
            /* 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/
            if (num2 > 0) {
                if(operator == '+') {
                    result = num1 + num2;
                } else if (operator == '-') {
                    result = num1 - num2;
                } else if (operator == '*') {
                    result = num1 * num2;
                } else if (operator == '/') {
                    result = num1 / num2;
                } else if (operator == '%'){
                    result = num1 % num2;
                }
            } System.out.println("결과: " + result);
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            /* exit을 입력 받으면 반복 종료 */
            String text = sc.nextLine();
            // 사용자로부터 한 줄 텍스트를 입력받습니다.
            if (text.equals("exit")) {
                break;
            }
        }
    }
}
