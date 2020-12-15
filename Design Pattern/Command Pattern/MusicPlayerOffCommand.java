public class MusicPlayerOffCommand implements Command {
    MusicPlayer musicPlayer;

    public MusicPlayerOffCommand(MusicPlayer musicPlayer){
        this.musicPlayer=musicPlayer;
    }
    @Override
    public void execute() {
       musicPlayer.off();
    }

    @Override
    public void undo() {
        System.out.println("-------작업 취소-------");
        musicPlayer.on();
    }
}
