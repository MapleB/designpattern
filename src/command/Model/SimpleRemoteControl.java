package command.Model;

import command.Model.base.Command;

/**
 * @author bifenglin
 * @date 2018/2/23 16:48
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command){
        slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
