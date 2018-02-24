package command.Model.stereo;

import command.Model.base.Command;
import command.Model.stereo.Stereo;

/**
 * @author bifenglin
 * @date 2018/2/23 17:40
 */
public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
