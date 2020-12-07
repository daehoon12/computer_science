public interface State {
    void processNumber(String ch); // 정수 처리
    void processOperator(char ch); // 사칙연산 처리
    void printOutResult(); // 결과 처리
    String getInput(String s);
    boolean run();
}
