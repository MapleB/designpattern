package command;

import command.Model.light.Light;
import command.Model.light.LightOnCommand;
import command.Model.SimpleRemoteControl;

/**
 * @author bifenglin
 * @date 2018/2/23 16:50
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("living room");
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();
    }
}
