package strategy.behavior.flybehavior;

/**
 * 飞行行为:正常飞行
 * @author bifenglin
 * @date 2018/2/2 14:45
 */
public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("i'm flying!");
    }
}
