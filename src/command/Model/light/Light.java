package command.Model.light;

/**
 * @author bifenglin
 * @date 2018/2/23 16:30
 */
public class Light {
    protected String lightType;

    public Light(String lightType) {
        this.lightType = lightType;
    }

    public void on() {
        System.out.println(lightType + "light on");
    }

    public void off() {
        System.out.println(lightType + "light off");
    }
}
