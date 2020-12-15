public class SimpleRemoteControl {
    Command slot;
    public void setCommand(Command command){
        slot = command;
    }
    public void buttonPressed(){
        slot.execute();
    }
}

//4. 인보커 객체 만들기
// 요청을 받아, 요청을 실행하기 위해 Command 인터페이스를 연결함.