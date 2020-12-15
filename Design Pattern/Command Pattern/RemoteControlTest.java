// Receiver : Light, MusicPlayer 등
// Command : Receiver의 메소드를 호출

public class RemoteControlTest {
    public static void main(String[] args) {
        MultipleRemoteControl remote = new MultipleRemoteControl(); // Invoker

        Light livingLight = new Light("거실"); // Receiver
        LightOnCommand livingLightOn = new LightOnCommand(livingLight);
        LightOffCommand livingLightOff = new LightOffCommand(livingLight);

        Light kitchenLight = new Light("부엌"); // Receiver
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        MusicPlayer musicPlayer = new MusicPlayer(); // Receiver
        MusicPlayerOnCommand musicPlayerOnCommand = new MusicPlayerOnCommand(musicPlayer);
        MusicPlayerOffCommand musicPlayerOffCommand = new MusicPlayerOffCommand(musicPlayer);

        // Invoker 객체의 커맨드 배열에 커맨드 저장
        remote.setCommand(0,livingLightOn, livingLightOff);
        remote.setCommand(1,kitchenLightOn, kitchenLightOff);
        remote.setCommand(2,musicPlayerOnCommand, musicPlayerOffCommand);

        // Invoker 객체에서 Command 객체의 execute 메소드 호출
        remote.onButtonPressed(0);
        remote.onButtonPressed(1);
        remote.onButtonPressed(2);
        remote.undoButonPressed();

        remote.offButtonPressed(0);
        remote.offButtonPressed(1);
        remote.offButtonPressed(2);
        remote.undoButonPressed();

        remote.onButtonPressed(4);
        remote.offButtonPressed(4);
        remote.undoButonPressed();
    }
}

// 5. 클라이언트 객체 만들기