package command.Model.light;

import command.Model.base.Command;
import command.Model.light.Light;

/**
 * @author bifenglin
 * @date 2018/2/23 17:37
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
