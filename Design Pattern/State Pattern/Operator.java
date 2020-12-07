import java.util.Scanner;

public class Operator implements State  {
    CalcV1 calc;
    Scanner scanner = new Scanner(System.in);
    public Operator(CalcV1 calc){
        this.calc = calc;
    }
    @Override
    public void processNumber(String ch) {
        int operand2 = Integer.parseInt("" + ch);
        calc.setOperand2(operand2);
        calc.setState(calc.getSecondOperend());
    }

    @Override
    public void processOperator(char ch) {

    }

    @Override
    public void printOutResult() {

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
        if (ch == 'q' || ch == 'Q') { // q를 입력하면 프로그램 종료
            return false;
        }
        else if (ch >= '0' && ch <= '9') { // 정수가 입력되면
            this.processNumber(inputStr);
        }

        return true;
    }
}
