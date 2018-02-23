package command.Model.light;

import command.Model.base.Command;
import command.Model.light.Light;

/**
 * @author bifenglin
 * @date 2018/2/23 16:30
 */
public class LightOnCommand implements Command {
    protected Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
