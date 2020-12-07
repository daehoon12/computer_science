import java.util.Scanner; 
// 이 녀석은 계산기를 구현한 코드다.
public class CalcV1 {
    private enum STATES { STATE_START, STATE_FIRST_OPERAND, STATE_SECOND_OPERAND, STATE_OPERATOR };
    Scanner scanner;
    String inputStr;
    public static int operand1; // 첫 번째 피 연산자값 저장
    public static int operand2; // 두 번째 피 연산자값 저장
    public char oper;
    State state;
    State firstOperend;
    State secondOperend;
    State start;
    State operator;


    CalcV1() {
        scanner = new Scanner(System.in);  // Create a Scanner object
        firstOperend = new FirstOperend(this);
        secondOperend = new SecondOperend(this);
        start = new Start(this);
        operator = new Operator(this);
        state = start;
    }

    String getInput(String s) {
        state.getInput(s);
        return scanner.next();
    }

    void printOutResult() {
        state.printOutResult();
    }

    /* 정수가 입력되었을 때 처리 */
    void processNumber(String ch) {
       state.processNumber(ch);
    }

    /* 사칙 연산자 혹은 = 연산자 처리 */
    void processOperator(char ch) {
        state.processOperator(ch);
    }

    boolean run() {
       return state.run();
    }

    public void setOperand1(int operand1) {
        this.operand1=operand1;
    }
    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }
    public int getOperand1() {
        return operand1;
    }
    public int getOperand2() {
        return operand2;
    }
    public char getOper() {
        return oper;
    }
    public void setOper(char oper) {
        this.oper = oper;
    }
    public void setState(State state) {
        this.state = state;
    }
    public State getState() {
        return state;
    }
    public State getFirstOperend() {
        return firstOperend;
    }
    public State getSecondOperend() {
        return secondOperend;
    }
    public State getStart() {
        return start;
    }
    public State getOperator() {
        return operator;
    }
}
