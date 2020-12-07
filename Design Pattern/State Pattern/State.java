public interface State {
    void processNumber(String ch);
    void processOperator(char ch);
    void printOutResult();
    String getInput(String s);
    boolean run();
}
