public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand (Light light){
        this.light=light;
    }
    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        System.out.println("작업 취소");
        light.off();
    }
}

//인터페이스를 상속받는 커맨드 객체 만들기