package command;

import command.Model.RemoteControl;
import command.Model.light.Light;
import command.Model.light.LightOffCommand;
import command.Model.light.LightOnCommand;
import command.Model.stereo.Stereo;
import command.Model.stereo.StereoOffWithCDCommand;
import command.Model.stereo.StereoOnWithCDCommand;

/**
 * @author bifenglin
 * @date 2018/2/23 17:45
 */
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        //设置装置
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Stereo stereo = new Stereo("Living Room");
        //创建所有点灯命令对象
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        //创建音响命令
        StereoOnWithCDCommand stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        StereoOffWithCDCommand stereoOffWithCDCommand = new StereoOffWithCDCommand(stereo);
        //设置控制器按键
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, stereoOnWithCDCommand, stereoOffWithCDCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtionWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtionWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtionWasPushed(2);
    }
}
