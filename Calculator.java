public class Calculator {
	
    public static double calculatePow(double num){
    	if(num >=0){
		return Math.sqrt(num);
	}else{
		System.out.println("음수의 제곱근을 계산할 수 없습니다.");

	}
    }

    public static double performOperation(double num1, double num2, char operator) {
        double result = 0.0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("0으로 나눌 수 없습니다.");
                }
                break;
	    case '^':
		result = Math.pow(num1, num2);
		break;
            default:
                System.out.println("올바른 연산자를 입력하세요.");
        }

        return result;
    }
}
