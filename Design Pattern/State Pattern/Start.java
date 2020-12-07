import java.util.Scanner;

public class Start implements State {
    private CalcV1 calc;
    Scanner scanner = new Scanner(System.in);
    public Start(CalcV1 calc){
        this.calc=calc;
    }
    @Override
    public void processNumber(String ch) { // 정수를 Ooperand1에 set 해주고 FirstOperent State로 바꿈
        int operand1 = Integer.parseInt("" + ch);
        calc.setOperand1(operand1);
        calc.setState(calc.getFirstOperend()); // transit to  FirstOperent
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
