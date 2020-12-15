public class LightOffCommand implements Command {
    Light light;
    public LightOffCommand(Light light){
        this.light=light;
    }
    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        System.out.println("작업 취소");
        light.on();
    }
}
