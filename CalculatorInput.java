import java.util.Scanner;

public class CalculatorInput {

    private static final String WELCOME_MESSAGE = "★ 간단한 콘솔 계산기 프로그램 ★";
    private static final String DIVIDER = "----------------------------------------";
    private static final String FIRST_NUMBER_PROMPT = "첫 번째 숫자를 입력하세요: ";
    private static final String SECOND_NUMBER_PROMPT = "두 번째 숫자를 입력하세요: ";
    private static final String OPERATOR_PROMPT = "사용할 연산자를 입력하세요 (+, -, *, /): ";
    private static final String RESULT_MESSAGE = "결과: ";

    public static void getInputAndCalculate() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(DIVIDER);
        System.out.println(WELCOME_MESSAGE);
        System.out.println(DIVIDER);

        System.out.print(FIRST_NUMBER_PROMPT);
        double num1 = scanner.nextDouble();

        System.out.print(SECOND_NUMBER_PROMPT);
        double num2 = scanner.nextDouble();

        System.out.print(OPERATOR_PROMPT);
        char operator = scanner.next().charAt(0);

        double result = Calculator.performOperation(num1, num2, operator);

        if (!Double.isNaN(result)) {
            System.out.println(DIVIDER);
            System.out.println(RESULT_MESSAGE + result);
            System.out.println(DIVIDER);
        } else {
            System.out.println("오류: 올바르지 않은 연산입니다.");
        }

        scanner.close();
    }
}

