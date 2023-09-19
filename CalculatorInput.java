import java.util.Scanner;

public class CalculatorInput {

    private static final String WELCOME_MESSAGE = "★ 공학 콘솔 계산기 프로그램 ★";
    private static final String DIVIDER = "----------------------------------------";
    private static final String EXPRESSION_PROMPT = "수식을 입력하세요 (예: 5 + 3): ";
    private static final String RESULT_MESSAGE = "결과: ";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(DIVIDER);
        System.out.println(WELCOME_MESSAGE);
        System.out.println(DIVIDER);

        System.out.print(EXPRESSION_PROMPT);
        double num1 = scanner.nextDouble();
        char operator = scanner.next().charAt(0);
        double num2 = scanner.nextDouble();

        double result = Calculator.performOperation(num1, num2, operator);

        System.out.println(DIVIDER);
        System.out.printf(RESULT_MESSAGE + "%.10f\n", result);
        System.out.println(DIVIDER);

        scanner.close();
    }
}

