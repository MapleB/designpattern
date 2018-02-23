package strategy.behavior.flybehavior;

/**
 * 飞行行为:穿上火箭！
 * @author bifenglin
 * @date 2018/2/2 15:06
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("i'm flying with a rocket");
    }
}
