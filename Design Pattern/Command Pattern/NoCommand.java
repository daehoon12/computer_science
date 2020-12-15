public class NoCommand implements Command{

    @Override
    public void execute() {
        System.out.println("명령 슬롯이 초기화 되어 있지 않습니다.");
    }

    @Override
    public void undo() {

    }
}

// 빈 명령 슬롯을 초기화 시키기 위한 Dummy Command