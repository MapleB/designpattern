package strategy.behavior.quackbehavior;

/**
 * 叫行为:咕咕叫
 * @author bifenglin
 * @date 2018/2/2 14:50
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("squeak");
    }
}
