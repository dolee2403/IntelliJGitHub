package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> intList = new ArrayList<Integer>(); // 적합한 컬렉션 타입의 변수 선언
        // 연산의 결과를 저장할 수 있도록 적합한 타입의 배열을 생성합니다.
        // 연산의 결과가 저장된 배열의 마지막 index를 저장하는 변수를 선언
        int[] results = new int[10]; // 예시로 크기를 10으로 설정
        int count = 0;

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

                intList.add(result);

                // 현재 저장된 결과의 개수가 배열 크기보다 크거나 같으면 가장 오래된 결과 삭제
                if (count >= results.length) {
                    for (int i = 0; i < results.length - 1; i++) {
                        results[i] = results[i + 1];
                    }
                    count--; // 삭제된 결과에 따라 현재 저장된 결과의 개수 감소
                }

                // 연산의 결과를 배열에 저장합니다.
                // index를 증가 시킵니다.
                results[count] = result;
                count++;
            }

            // 결과 출력
            System.out.println("결과: " + result);

            // 배열에서 컬렉션으로 변경됨으로써 변경해야하는 부분 구현

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String text = sc.nextLine();
            if (text.equals("remove")) {
                intList.remove(0); // 1번순번의 값을 삭제합니다.
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            text = sc.nextLine();
            if (text.equals("exit")) {
                break;
            }
        }
        // 결과 배열 출력
        // 10개 이상의 값을 입력 시 맨 앞의 값이 없어지고 맨 마지막 값이 들어온다.
        System.out.println("모든 연산 결과:");
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(intList.get(i));
        }

    }
}
