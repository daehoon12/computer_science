public class MultipleRemoteControl { // Invoker 객체
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public MultipleRemoteControl(){
        onCommands= new Command[7];
        offCommands = new Command[7];
        NoCommand nocommand = new NoCommand();

        for (int i=0;i<7;i++){
            onCommands[i]=nocommand;
            offCommands[i] = nocommand;
        }
        undoCommand = nocommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot]=onCommand;
        offCommands[slot]=offCommand;
    }

    public void onButtonPressed(int slot){
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonPressed(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButonPressed(){
        undoCommand.undo();
    }
}

