import java.util.Scanner;

public class SecondOperend implements State {
    CalcV1 calc;
    Scanner scanner = new Scanner(System.in);
    public SecondOperend(CalcV1 calc){
        this.calc = calc;
    }
    @Override
    public void processNumber(String ch) {

    }

    @Override
    public void processOperator(char ch) {
        if (ch == '=') {
            this.printOutResult(); // 결과값 출력
        }
    }

    @Override
    public void printOutResult() { // 결과 처리 methd
        int operand1 = calc.getOperand1();
        int operand2 = calc.getOperand2();
        char operator = calc.getOper();
        switch (operator) {
            case '+':
                System.out.printf("%d + %d = %d\n", operand1, operand2, operand1 + operand2);
                break;

            case '-':
                System.out.printf("%d - %d = %d\n", operand1, operand2, operand1 - operand2);
                break;

            case '*':
                System.out.printf("%d * %d = %d\n", operand1, operand2, operand1 * operand2);
                break;

            case '/':
                System.out.printf("%d / %d = %d\n", operand1, operand2, operand1 / operand2);
                break;
        }
        calc.setState(calc.getStart());
    }

    @Override
    public String getInput(String s) {
        System.out.println(s);
        return scanner.next();
    }


    @Override
    public boolean run() {
        String inputStr = getInput("정수 또는 +,-,*,/,= 기호 중 한 개를 입력하세요");
        char ch = inputStr.charAt(0);
        if (ch == 'a' || ch == 'Q') { // q를 입력하면 프로그램 종료
            return false;
        }
        else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '=') { // 연산자 처리
            this.processOperator(ch);
        }
        return true;
    }

}
