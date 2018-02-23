package strategy.behavior.flybehavior;

/**
 * 飞行行为:不能飞行
 * @author bifenglin
 * @date 2018/2/2 14:47
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("i can't fly!");
    }
}
