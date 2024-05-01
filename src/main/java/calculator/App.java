package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> intList = new ArrayList<Integer>(); // 적합한 컬렉션 타입의 변수 선언
        // 연산의 결과를 저장할 수 있도록 적합한 타입의 배열을 생성합니다.
        // 연산의 결과가 저장된 배열의 마지막 index를 저장하는 변수를 선언

        Calculator calculator = new Calculator();

        // 반복문 사용하여 연산을 반복
        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: "); // + - * /
            char operator = sc.next().charAt(0);
            sc.nextLine();

            int result = 0;
            // 제어문을 사용하여 연산을 수행하고 결과를 배열에 저장
            // 계산 및 결과 저장

            try{
                //에러가 발생할 수 있는 코드
                result = calculator.calculate(num1, num2, operator);
                intList.add(result);
                System.out.println(intList);
            }catch (Exception e){
                //에러시 수행
                System.out.println(e.getMessage());
                //오류 출력(방법은 여러가지)
            }

            calculator.removeResult(); // 연산 결과 제거
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String text = sc.nextLine();
            if (text.equals("remove")) {
                intList.remove(0); // 1번 순번의 값을 삭제합니다.
                System.out.println(intList);
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
           text = sc.nextLine();
            if (text.equals("exit")) {
                break;
            }
        }
        calculator.inquiryResults(); // 모든 연산 결과 출력
    }
}
