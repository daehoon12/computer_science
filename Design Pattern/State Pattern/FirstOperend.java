import java.util.Scanner;

public class FirstOperend implements State { // 사칙연산을 처리하는 Class
    CalcV1 calc;
    Scanner scanner = new Scanner(System.in);
    public FirstOperend(CalcV1 calc) {
        this.calc=calc;
    }

    @Override
    public void processNumber(String ch) {

    }

    @Override
    public void processOperator(char ch) {
        calc.setOper(ch); // oper에 ch값 넣음
        calc.setState(calc.getOperator()); //transit to Operate
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
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '=') { // 연산자 처리
                this.processOperator(ch);
            }
            return true;
    }
}
